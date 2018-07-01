__Databases__
- tool for storing massive amounts of information to be retrieved at a later time
- useful for adding, updating, and deleting data

__SQL__
- Structured Query Language
- reading data from a database is called querying

__Types of SQL Databases__
- MySQL
- PostgreSQL
- Microsoft SQL
- Oracle
- SQLite

__Schema__
- how the data is organized
- establishes how the data should be stored and divided into different sections and how the sections relate to each other

__Tables__
- these sections of a database
- like a spreadsheet of rows and columns

__Datatypes__
- __Text__
    - store names and descriptions
- __Numeric__
    - store prices, ages and quantities
- __Date__
    - store temporal information (e.g. dates and times)
    
__Syntax__
- the vocabulary and grammatical structure of a programming language

__Keywords__
- the vocabulary words of a programming language - commands issued to a computer

__Statement/Query__
- lines of SQL code
- a _statement_ is like a sentence 
- a _query_ is like a question
- most queries are issued to the database one at a time
- "running a query" or "executing the sql" refers to issuing a statement

__Relational Keys__
- __Superkey__
    - any combination of columns that uniquely identifies a row in a table
- __Candidate key__
    - a superkey such that no proper subset is a superkey and has _uniqueness_ and _irreducibility_
- __Primary key__
    - the candidate key that is selected to identify tuples uniquely within the relation - if a relation has several candidate keys, only one is chosen to be the primary key
- __Foreign key__
    - an attribute or set of attributes within one relation that matches the candidate key of some other relation

__Relational Database__
- a digital database whose organization is based on the relational model of data
- set of tables that satisfy _entity integrity_, _domain integrity_, _referential integrity_, and _user-defined integrity_

__Functional Dependency__
- dependency occurs when an attribute or set of attributes identifies a particular value of another attribute
- when designing an efficient database that avoids redundancy, identifying dependencies help us to ensure every column in a table is dependent on the primary key and it helps to keep the primary key as simple as possible
- i.e. a foreign key
- very important to define 

__Types of Joins__
- __Inner Join__
    - takes the two tables and looks only at the matching rows
    - any rows in either table that don't have any overlap are discarded
- __Left Outer Join__
    - the left table is the primary table, no rows will be discarded from it
    - the data from the two tables that overlap join the primary table and any remaining rows from the non-primary table are discarded
- __Right Outer Join__
    - the right table is the primary table, no rows will be discarded from it
    - the data from the two tables that overlap join the primary table and any remaining rows from the non-primary table are discarded
- __Full Outer Join__
    - the join will not discard any of the rows in any of the two tables
    - the tables are glued together
