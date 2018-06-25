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

-- import Pets.csv file
COPY pets FROM '/users/iolaleye/Downloads/database/Pets.csv' DELIMITER ',' CSV HEADER;

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

-- import Owners.csv file
COPY owners FROM '/users/iolaleye/Downloads/database/Owners.csv' DELIMITER ',' CSV HEADER;

-- create proceduredetails table
CREATE TABLE proceduredetails (
    proceduretype varchar,
    proceduresubcode varchar,
    description varchar,
    price float
);

-- import proceduredetails.csv file
COPY proceduredetails FROM '/users/iolaleye/Downloads/database/proceduredetails.csv' DELIMITER ',' CSV HEADER;

-- create procedurehistory table
CREATE TABLE procedurehistory (
    petid varchar,
    proceduredate date,
    proceduretype varchar,
    proceduresubcode varchar
);

-- import procedurehistory.csv file 
COPY procedurehistory FROM '/users/iolaleye/Downloads/database/procedurehistory.csv' DELIMITER ',' CSV HEADER;

