-------------------------------------------------
-- SELECT
-------------------------------------------------
---> SELECT <column name> FROM <table name>;

-- select all from a database
SELECT * FROM patrons;

-- select one column from a database
SELECT email FROM patrons;

-- select multiple columns
SELECT email, first_name FROM patrons;

-- change the order in which it appears
SELECT first_name, email FROM patrons;

-------------------------------------------------
-- ALIASES
-------------------------------------------------
---> SELECT <column name> AS <new name> FROM <table name>;

-- aliasing a single word
SELECT title AS Title FROM books;

-- aliasing multiple words requires quotes
-- // NOTE: syntax in different SQL environments vary. Some platforms require single quotes or brackets
SELECT username AS Username, first_name AS "First Name" FROM users;
SELECT title AS Title, year AS "Year Released" FROM movies;
SELECT name AS Name, description AS Description, price AS "Current Price" FROM products;

-- shorthand for aliases is removing the AS keyword
SELECT name Name, description Description, price "Current Price" FROM products;

-------------------------------------------------
-- WHERE
-------------------------------------------------
---> SELECT <column name(s)> FROM <table name> WHERE <condition>;
---> i.e. SELECT <column name(s)> FROM <table name> WHERE <column> <operator> <value>;

-- What are the titles and authors of the books in the library published in 1997?
SELECT title, author FROM books WHERE first_published = 1997;

-- What are all the books authored by J.K. Rowling and what year were they first published?
-- // NOTE: the equals operator is strict and case sensitive
SELECT title, first_published FROM books WHERE author = "J.K. Rowling";

-- What books were not authored by J.K. Rowling?
SELECT title, author, first_published FROM books WHERE author != "J.K. Rowling";

-- What books were loaned on the 10th of December 2015?
SELECT book_id FROM loans WHERE loaned_on = "2015-12-10";

-- Which book is book 15?
SELECT title FROM books WHERE id = 15;

-------------------------------------------------
-- AND
-------------------------------------------------
---> i.e. SELECT <column name(s)> FROM <table name> WHERE <column> <operator> <value> AND <column> <operator> <value>;

-- both conditions must be true
SELECT company, product_name, issue
FROM consumer_complaints
WHERE state_name = 'CA' AND timely_response = 'YES';

-------------------------------------------------
-- OR
-------------------------------------------------
---> i.e. SELECT <column name(s)> FROM <table name> WHERE <column> <operator> <value> OR <column> <operator> <value>;

-- either condition must be true
SELECT company, product_name, issue
FROM consumer_complaints
WHERE state_name = 'CA' AND timely_response = 'YES';

-------------------------------------------------
-- WILDCARDS
-------------------------------------------------
---> i.e. SELECT <column name(s)> FROM <table name> WHERE <column> LIKE <value>;
---> i.e. SELECT <column name(s)> FROM <table name> WHERE <column> NOT LIKE <value>;
---> used to specify words or phrases you're looking to find

-- looking for product names that contain the word 'Credit'
SELECT product_name
FROM consumer_complaints
WHERE product_name LIKE '%Credit%';

-- // NOTE: MS SQL is case insensitive by default
-- // NOTE: PostgreSQL is case sensitive so it will look for 'Credit' exactly - lowercase or uppercase versions of the word will be excluded

-- to change product_name values to lowercase in PostgreSQL, must also put condition in lowercase
SELECT product_name
FROM consumer_complaints
WHERE LOWER(product_name) LIKE '%credit%';

-- to change product_name values to uppercase in PostgreSQL, must also put condition in uppercase
SELECT product_name
FROM consumer_complaints
WHERE UPPER(product_name) LIKE '%CREDIT%';

-- to search for zip code that starts with 4, add 4 trailing underscores
SELECT company, product_name, zip_code
FROM consumer_complaints
WHERE zip_code LIKE '4____';

-- to search for zip code that contains 4 or ends with 4
WHERE zip_code LIKE '__4__'
WHERE zip_code LIKE '____4'

-- to search for zip code that does NOT start with 4
SELECT company, product_name, zip_code
FROM consumer_complaints
WHERE zip_code NOT LIKE '4%';

-- to search for zip code that does NOT contain 4 at all
WHERE zip_code NOT LIKE '%4%';

-------------------------------------------------
-- COUNT
-------------------------------------------------
---> i.e. SELECT COUNT <column name(s)> FROM <table name> WHERE <column> <operator> <value>;

-- return the number of instances where date_required = date_sent
SELECT COUNT (complaint_id)
FROM consumer_complaints
WHERE date_recieved = date_sent;

-------------------------------------------------
-- LENGTH
-------------------------------------------------
---> length(<column name>)

-- returns the number of characters that each game name consists of
SELECT game_name, length(game_name)
FROM console_games;

-------------------------------------------------
-- LEFT
-------------------------------------------------
---> left(<column name>, <number>)

-- returns the FIRST 4 letters of the publisher
SELECT left(publisher, 4)
FROM console_games;

-------------------------------------------------
-- RIGHT
-------------------------------------------------
---> right(<column name>, <number>)

-- returns the LAST 4 letters of the publisher
SELECT left(publisher, 4)
FROM console_games;

-------------------------------------------------
-- REVERSE
-------------------------------------------------
---> reverse(<column name>)

-- reverses the order of the characters, retaining case sensitivity
SELECT reverse(genre)
FROM console_games;

-------------------------------------------------
-- Temporary Column
-------------------------------------------------
-- creates days_existed as a temporary column which contains the results of first_retail_availability - discontinued 
SELECT *, discontinued - first_retail_availability AS days_existed
FROM console_dates
ORDER BY days_existed;

-------------------------------------------------
-- DATE_PART
-------------------------------------------------
---> DATE_PART('<date type>', <column name>)

-- grabs the year from specified columns
SELECT *, DATE_PART('year', discontinued) - DATE_PART('year', first_retail_availability) AS years_existed
FROM console_dates
ORDER BY years_existed;
