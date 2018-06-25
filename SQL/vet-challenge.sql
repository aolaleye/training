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
SELECT *
FROM pets
LEFT JOIN owners
ON pets.ownerid = owners.ownerid
