import streamlit as st
import pandas as pd
import numpy as np

from antlr4 import *
from pandaQVisitor import pandaQVisitor
from pandaQLexer import pandaQLexer
from pandaQParser import pandaQParser

from operator import add, sub, mul, truediv


PATH_TABLES = "data/"
#PATH_TABLES = ""


class myPandaQVisitor(pandaQVisitor):

    def __init__(self):
        self.dfrSave = []

    #region ROOTs i SELECT
    def visitRootNormal(self, ctx):
        [expressio,_] = list(ctx.getChildren())
        df = self.visit(expressio)
        return df

    def visitRootStore(self, ctx):
        [var, _, expressio,_] = list(ctx.getChildren())
        df = self.visit(expressio)
        st.session_state[var.getText()] = df.copy()
        return df
    
    def visitRootAppend(self, ctx):
        [var, _, expressio,_] = list(ctx.getChildren())
        df = self.getDataframe(var)
        df2 = self.visit(expressio)
        df = pd.concat([df, df2], ignore_index=True)
        st.session_state[var.getText()] = df.copy()
        return df
    
    def visitRootPlot(self, ctx):
        [_,var,_] = list(ctx.getChildren())
        df = self.getDataframe(var)
        df_filtered = df.select_dtypes(include=[np.number])  
        st.line_chart(df_filtered)
        return None
    
    def visitExprSelectUnion(self, ctx):
        [exprSelect, *unions] = list(ctx.getChildren())
        df = self.visit(exprSelect)
        for elem in unions:
            if elem.getText() != ",":
                df2 = self.visit(elem)
                df = pd.concat([df, df2], ignore_index=True)

        return df


    def visitExprSelect(self, ctx):

        #guardar df
        if hasattr(self,'dfr'): self.dfrSave.append(self.dfr)

        #select
        [_, camps, _, taulesExpr, *clauses] = list(ctx.getChildren())

        self.visit(taulesExpr)

        campsList = None
        if camps.getText() != '*':
            campsList = self.visit(camps)
        
        for clause in clauses:
            self.visit(clause)

        if camps.getText() != '*':
            self.dfr = self.dfr[campsList]

        #recuperar dfs
        df = self.dfr

        if self.dfrSave:
            self.dfr = self.dfrSave.pop(-1)

        return df.copy()

        
    #endregion

    #region ORDER BY
    def visitOrderByClause(self, ctx):
        campsOrders = [self.visit(orderByCamp) for orderByCamp in list(ctx.getChildren()) if orderByCamp.getText() not in [",", "order by"] ]
        camps, orders = zip(*campsOrders)
        camps = list(camps)
        orders = list(orders)
        self.dfr = self.dfr.sort_values(by=camps, ascending=orders)

    def visitOrderByCamp(self, ctx):
        [camp,*ordre] = list(ctx.getChildren())
        ascending = True
        if ordre and ordre[0].getText() == "desc": ascending = False
        return (camp.getText(), ascending) 
    #endregion
    
    #region CAMPS
    def visitCamps(self, ctx):
        return [self.visit(x) for x in list(ctx.getChildren()) if x.getText() != ","]
 
    def visitParaula(self, ctx):
        [x] = list(ctx.getChildren())
        return x.getText()
    
    def visitCampCalculat(self, ctx):
        [calcul, _ , nom] = list(ctx.getChildren()) 
        nom = nom.getText()
        self.dfr[nom] = self.visit(calcul)
        return nom

    def visitCalculNumPar(self, ctx):
        [a] = list(ctx.getChildren()) 
        a = a.getText()
        try:
            a = float(a)
        except:
            a = self.dfr[a]
        return a

    def visitCalculParentesis(self, ctx):
        [_, calcul, _] = list(ctx.getChildren()) 
        return self.visit(calcul)

    def visitCalculBin(self, ctx):
        [calcul1, op, calcul2] = list(ctx.getChildren()) 
        operacions = {'+': add, '-': sub, '*': mul, '/': truediv}
        return operacions[op.getText()](self.visit(calcul1),  self.visit(calcul2))

    #endregion
    
    #region WHERE
    def visitWhereClause(self, ctx):
        [_, clause] = list(ctx.getChildren())
        mask = self.visit(clause)
        self.dfr = self.dfr[mask]

    def visitWhereEqGt(self, ctx):
        [a,op,b] = list(ctx.getChildren())
        
        a = self.visit(a)
        b = self.visit(b)
        
        if op.getText() == "=":
            return a == b
        elif op.getText() == "<":
            return a < b
        elif op.getText() == ">":
            return a > b
        elif op.getText() == "<=":
            return a <= b
        elif op.getText() == ">=":
            return a >= b

    def visitWhereCampNUM(self, ctx):
        [num] = list(ctx.getChildren())
        return float(num.getText())

    def visitWhereCampStringParaula(self, ctx):
        [string] = list(ctx.getChildren())
        string = string.getText()
        try:
                string = self.dfr[string]
        except:
                pass # a ja es el string que volem
        return string


    def visitWhereCampStringCometes(self, ctx):
        string = [x.getText() for x in list(ctx.getChildren()) if x.getText() != '"']
        return " ".join(string)


    def visitWhereSubconsulta(self, ctx):
        [a, _, _, exprSelect, _] = list(ctx.getChildren())
        df = self.visit(exprSelect)
        return self.dfr[a.getText()].isin(df.iloc[:, 0])    

    def visitWhereParentesis(self, ctx):
        [_, expr, _] = list(ctx.getChildren())
        return self.visit(expr)

    def visitWhereAndOr(self, ctx):
        [a,op,b] = list(ctx.getChildren())
        a = self.visit(a)
        b = self.visit(b)

        if op.getText() == "and":
            return ((a) & (b))
        elif op.getText() == "or":
            return ((a) | (b))

    def visitWhereNot(self, ctx):
        [_, expr] = list(ctx.getChildren())
        return ~self.visit(expr)

    #endregion
    
    #region innerJoin
    def visitTaulesExpr(self, ctx):
        [taula, *innerJoins] = list(ctx.getChildren())
        self.dfr = self.getDataframe(taula)

        for joinExpr in innerJoins:
            self.visit(joinExpr)

    def visitInnerJoinExpr(self, ctx):
        [_, taula2, _, camp1, _, camp2] = list(ctx.getChildren())
        df2 = self.getDataframe(taula2)
        self.dfr = pd.merge(self.dfr, df2, left_on=camp1.getText(), right_on=camp2.getText(), how='inner')
    
    #endregion
    
    def getDataframe(self, nom):
        if nom in st.session_state:
            return st.session_state[nom].copy()
        return pd.read_csv(f"{PATH_TABLES}{nom.getText()}.csv")

#region MAIN 

st.header("PandaQ: Pau Mayench Caro\nProjecte LP 2023 QT \n")

query = st.text_area("Query:", height=100)
submit_button = st.button("Submit")

if submit_button:
    query = InputStream(query)
    lexer = pandaQLexer(query)
    token_stream = CommonTokenStream(lexer)
    parser = pandaQParser(token_stream)
    tree = parser.root()
    if parser.getNumberOfSyntaxErrors() == 0:
        visitor = myPandaQVisitor()
        df = visitor.visit(tree)
        if df is not None:
            st.dataframe(data=df)
    else:
        print(parser.getNumberOfSyntaxErrors(), 'errors de sintaxi.')
        print(tree.toStringTree(recog=parser))

#endregion

''' 
TEST QUERIES:\n
q := select  email, salary*1.15 as new_salary from dependents inner join employees on employee_id = employee_id inner join jobs on job_id = job_id where department_id in (select department_id from departments inner join locations on location_id = location_id inner join countries on country_id = country_id where not (country_name = "United States of America" or  country_name = "Canada")) and  new_salary <= max_salary order by new_salary desc;\n
w := select email, salary*0.85 as new_salary from dependents inner join employees on employee_id = employee_id inner join jobs on job_id = job_id where department_id in (select department_id from departments inner join locations on location_id = location_id inner join countries on country_id = country_id where country_name = "United States of America" ) and new_salary >= min_salary order by new_salary desc;\n
r := select * from q union all select * from  w;\n

select location_id from dependents 
inner join employees on employee_id = employee_id 
inner join departments on department_id = department_id 
inner join locations on location_id = location_id 
where employee_id in 
(select employee_id from employees where department_id in 
(select department_id from departments where location_id in
(select location_id from locations where location_id >= 1800)));\n



QUERIES BY EXERCISES:\n
1.\n
select * from countries;\n

2. \n
select first_name,last_name from employees;\n
select first_name,salary,salary*1.05 as new_salary from employees;\n

select employee_id from employees;\n
select employee_id , email from employees;\n
select employee_id , email, 2 + employee_id as hehe from employees;\n
select employee_id , email, ((employee_id + 2) * 3 ) / employee_id as hehe from employees;\n

3.\n
select * from countries order by region_id, country_name desc;\n

select first_name,salary,salary*1.05 as new_salary from employees order by salary desc;\n


select first_name,salary,salary*15 - salary as new_salary from employees order by hire_date, salary desc;\n

4.\n
select * from countries where not region_id=1 and not region_id=3;\n

select first_name, salary, salary + 1 as hehe from employees where hehe <= 10000;\n

select * from countries where not( region_id=1 );\n

5.\n
select first_name, department_name from employees
inner join departments on department_id = department_id;\n

select first_name, last_name, job_title, department_name
from employees inner join departments on department_id = department_id
inner join jobs on job_id = job_id;\n

6.\n
q := select first_name, last_name, job_title, department_name
from employees inner join departments on department_id = department_id
inner join jobs on job_id = job_id;\n

select first_name, last_name from q;\n

7.\n
q := select first_name, last_name, salary,salary * 1.05 as new_salary from employees where department_id = 5;\n
plot q;

8.\n
select employee_id, first_name, last_name from employees
where department_id in
(select department_id from departments where location_id = 1700)
order by first_name, last_name;\n


'''




