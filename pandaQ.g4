
grammar pandaQ;

root : 'plot' PAR ';'              #rootPlot
     |  PAR ':=' exprSelectUnion ';'    #rootStore
     |  exprSelectUnion ';'             #rootNormal
     ;         

exprSelectUnion: exprSelect ('union' 'all' exprSelect)*;

exprSelect : 'select' ('*'|camps) 'from' taulesExpr (whereClause)? (orderByClause)?
           ;

orderByClause: 'order by' orderByCamp (',' orderByCamp)* ;
orderByCamp : PAR ('asc' | 'desc')?;

camps : (paraula | campCalculat) (',' paraula |',' campCalculat)*;
campCalculat : calcul 'as' PAR;
paraula : PAR;

calcul : '(' calcul ')'             #calculParentesis
       | calcul ('*'|'/') calcul    #calculBin
       | calcul ('+'|'-') calcul    #calculBin
       | (PAR | NUM )  #calculNumPar
       ;


whereClause: 'where' whereExpr;
whereExpr:  '(' whereExpr ')'                   #whereParentesis
         |  'not' whereExpr                     #whereNot
         |   whereExpr ('and') whereExpr        #whereAndOr
         |   whereExpr ('or') whereExpr         #whereAndOr
         |   PAR 'in' '(' exprSelect ')'        #whereSubconsulta
         |   whereCamp ('='|'<'|'>'|'<='|'>=') whereCamp  #whereEqGt
         ;

whereCamp :  NUM                          #whereCampNUM
          |  PAR                          #whereCampStringParaula
          | '"' (PAR|NUM) (PAR|NUM)* '"'  #whereCampStringCometes
          ;

taulesExpr: PAR (innerJoinExpr)*;
innerJoinExpr: 'inner join' PAR 'on' PAR '=' PAR;

NUM : [0-9]+ ('.' [0-9]+)?;
PAR : [A-Za-z0-9_]+ ;
WS  : [ \t\n\r]+ -> skip ;