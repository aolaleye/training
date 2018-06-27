-------------------------------------------------
-- CHALLENGE 2
-------------------------------------------------
-- 1. Extract information on pet names and owner names side-by-side
-- 2. Find out which pets from this clinic had procedures performed
-- 3. Match up all procedures performed to their descriptions
-- 4. Same as above but only for the pets from the clinic in question
-- 5. Extract a table of individual costs (procedure prices) incurred by owners of pets from the clinic in question (this table should have owner and procedure price side-by-side)

-------------------------------------------------
-- Create Tables / Import Data
-------------------------------------------------
-- create pets table
CREATE TABLE pets (
    petid varchar,
    name varchar,
    kind varchar,
    gender varchar,
    age int,
    ownerid varchar
);

-- create owners table
CREATE TABLE owners (
    ownerid varchar,
    name varchar,
    surname varchar,
    streetaddress varchar,
    city varchar,
    state varchar(2),
    statefull varchar,
    zipcode varchar
);

-- create proceduredetails table
CREATE TABLE proceduredetails (
    proceduretype varchar,
    proceduresubcode varchar,
    description varchar,
    price float
);

-- create procedurehistory table
CREATE TABLE procedurehistory (
    petid varchar,
    proceduredate date,
    proceduretype varchar,
    proceduresubcode varchar
);

-- import Pets.csv file
COPY pets FROM '/users/iolaleye/Downloads/database/Pets.csv' DELIMITER ',' CSV HEADER;

-- import Owners.csv file
COPY owners FROM '/users/iolaleye/Downloads/database/Owners.csv' DELIMITER ',' CSV HEADER;

-- import proceduredetails.csv file
COPY proceduredetails FROM '/users/iolaleye/Downloads/database/ProceduresDetails.csv' DELIMITER ',' CSV HEADER;

-- import procedurehistory.csv file 
COPY procedurehistory FROM '/users/iolaleye/Downloads/database/ProceduresHistory-1.csv' DELIMITER ',' CSV HEADER;

-------------------------------------------------
-- 1. Extract information on pet names and owner names side-by-side
-------------------------------------------------
-- join tables and show all info
SELECT *
FROM pets
LEFT JOIN owners
ON pets.ownerid = owners.ownerid;

-- shows name of pets and corresponding owner
SELECT pets.name, owners.name
FROM pets
LEFT JOIN owners
ON pets.ownerid = owners.ownerid;

-- shows the names of the pets and owners that start with the same letter
SELECT pets.name, owners.name
FROM pets
LEFT JOIN owners
ON pets.ownerid = owners.ownerid
WHERE LEFT(pets.name, 1) = LEFT(owners.name, 1);

-- using an alias
SELECT A.name, B.name
FROM pets AS A
LEFT JOIN owners AS B
ON A.ownerid = B.ownerid
WHERE LEFT(A.name, 1) = LEFT(B.name, 1);

-- using aliases for columns (remember the AS keyword can be eliminated)
SELECT A.name AS pet_name, B.name AS owner_name
FROM pets AS A
LEFT JOIN owners AS B
ON A.ownerid = B.ownerid
WHERE LEFT(A.name, 1) = LEFT(B.name, 1);

-------------------------------------------------
-- 3. Match up all procedures performed to their descriptions
------------------------------------------------
-- inner join
SELECT * 
FROM pets AS A
INNER JOIN procedurehistory AS B
ON A.petid = B.petid;

-- full outer join - also shows the results with no matches, so it also shows the pets that haven't had any procedures
SELECT * 
FROM pets AS A
FULL OUTER JOIN procedurehistory AS B
ON A.petid = B.petid;

-------------------------------------------------
-- 4. Same as above but only for the pets from the clinic in question
------------------------------------------------

