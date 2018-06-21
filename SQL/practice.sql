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
---> i.e. SELECT <column name(s) FROM <table name> WHERE <column> <operator> <value>;

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
---> i.e. SELECT <column name(s) FROM <table name> WHERE <column> <operator> <value> AND <column> <operator> <value>;

-- both conditions must be true
SELECT company, product_name, issue
FROM customer_complaints
WHERE state_name = 'CA' AND timely_response = 'YES'

-------------------------------------------------
-- OR
-------------------------------------------------
---> i.e. SELECT <column name(s) FROM <table name> WHERE <column> <operator> <value> OR <column> <operator> <value>;

-- either condition must be true
SELECT company, product_name, issue
FROM customer_complaints
WHERE state_name = 'CA' AND timely_response = 'YES'

-------------------------------------------------
-- WILDCARDS
-------------------------------------------------
---> i.e. SELECT <column name(s) FROM <table name> WHERE <column> LIKE <value>;
---> used to specify the words or phrases you're looking to find

-- looking for product names that contain the word 'Credit'
SELECT company, product_name, issue
FROM customer_complaints
WHERE product_name LIKE '%Credit%'

-- // NOTE: MS SQL is case insensitive by default
-- // NOTE: PostgreSQL is case sensitive so it will look for 'Credit' exactly - lowercase or uppercase versions of the word will be excluded

