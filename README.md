# PandaQ Treball Llenguatges de Programacio 2023QT FIB
by Pau Mayench Caro


## Overview

PandaQ is an interactive web application built using Streamlit, allowing users to execute SQL-like queries on structured data loaded directly from CSV files. The application leverages the power of ANTLR4 for parsing custom query syntax and manipulates dataframes using Python’s Pandas library. This project was developed as part of the 2023 Programming Languages course at FIB (Facultat d'Informàtica de Barcelona). The source code and functionality of PandaQ are defined according to the specifications and instructions provided on [this webpage](https://gebakx.github.io/lp-pandaQ-23/). 

![image](https://github.com/PauMayench/SQL-python-interpreter/assets/120923489/0379298b-cab3-4729-becf-61d1352445a5)


## Main Features
- **Interactive Query Execution:** Users can input their SQL-like queries directly into the web interface, which are parsed and executed to manipulate and display data dynamically.
- **Dynamic Data Management:** Beyond just running queries, users can store results temporarily, append data to existing sets, and visualize data through built-in plotting functionalities.
- **Advanced SQL Features Emulation:** The application supports a subset of SQL operations including SELECT statements with conditions, JOIN operations, and even custom SQL functions like UNION ALL for combining query results.

## Technical Components
- **ANTLR4:** Used for generating the lexer and parser to handle the custom query syntax.
- **Pandas:** Manages all data storage, querying, manipulation, and aggregation operations efficiently.
- **NumPy:** Utilized for numerical operations within dataframes.
- **Streamlit:** Facilitates the creation of the web interface, providing users with a responsive and interactive experience.


## Prerequisites

To ensure proper functionality of the PandaQ application, you need to install the following libraries:

- `streamlit`: For creating and managing the interactive web interface.
- `antlr4`: Required for parsing custom query syntax in the application.

## Installation

To compile the grammar file and generate the necessary Python code using ANTLR4, run the following command in your terminal:

```bash
antlr4 -Dlanguage=Python3 -no-listener -visitor pandaQ.g4
```

## Running the Application
To launch the PandaQ web interface, execute the following command in your terminal:

```bash
streamlit run pandaQ.py
```

This command starts the Streamlit server and opens the web application in your default web browser, ready for querying and data manipulation.

> **⚠️ Important:** CSV files must be located within a folder in the same directory named `data`.


Example directory structure:

- pandaQ.py
- pandaQ.g4
- data/*.csv

To change the path of the tables, simply alter the global PATH_TABLES variable at the beginning of the script pandaQ.py to the desired path:

- default -> PATH_TABLES = "data/"
- files in the same directory -> PATH_TABLES = ""
### SQL Particularities:

SQL commands must be executed in lowercase.
Additional test sets, besides the given examples, can be found at the bottom of the query box in the streamlit application.
A new feature added: UNION ALL, which allows the union of the results of two queries as long as they have the same fields. This type of union allows duplicated tuples. An example can be seen in the first TEST QUERIES example in streamlit, where we save the result of two queries and then perform a union all with these results, resulting in their union (does not maintain tuple indices).
Examples of SQL queries:
```sql
q := select email, salary*1.15 as new_salary from dependents inner join employees on employee_id = employee_id inner join jobs on job_id = job_id where department_id in (select department_id from departments inner join locations on location_id = location_id inner join countries on country_id = country_id where not (country_name = "United States of America" or country_name = "Canada")) and new_salary <= max_salary order by new_salary desc;
```
```sql
r := select * from q union all select email, salary*0.85 as new_salary from dependents inner join employees on employee_id = employee_id inner join jobs on job_id = job_id where department_id in (select department_id from departments inner join locations on location_id = location_id inner join countries on country_id = country_id where country_name = "United States of America") and new_salary >= min_salary order by new_salary desc;
```

- It's possible to sort by both calculated fields and unselected fields in an order by clause.
- In the where clause, to search/compare a table field with a string, place the string you want to compare in quotes. If the string doesn't contain spaces or is not a field name, it can also be used without quotes.
- You can use the operators <, >, <=, >=, = in the fields of the where clause.

### Script Particularities:

- When plotting, the same visitor that performs the "display" (st.linechart) returns None. However, when performing a query, the visitor returns the dataframe to be displayed.
- Optionally, the .streamlit folder contains a config.toml file which changes the default color to green. The application works perfectly without this file.
