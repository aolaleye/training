-------------------------------------------------
-- CHALLENGE 1
-------------------------------------------------
-- 1. Calculate what percentage of Global Sales were made in North America
-- 2. Extract a view of the console game titles ordered by platform name in ascending order and year of relase in descending order
-- 3. For each game title, extract the first four letters of the publisher's name
-- 4. Display all console platforms which were released either just before Black Friday or just before Christmas (in any year)
-- 5. Order the platforms by the longevity in ascending order (i.e. the platform which was available for the longest at the bottom)
-- 6. Demonstrate how to deal with the Game_Year column if the client wants to convert it to a different data type
-- 7. Provide recommendations on how to deal with missing data in the file

-------------------------------------------------
-- Create Tables / Import Data
-------------------------------------------------
-- create console_games table
CREATE TABLE console_games (
    game_rank integer,
    game_name varchar(1200),
    platform varchar(1200),
    game_year integer,
    genre varchar(20),
    publisher varchar(1200),
    na_sales float8,
    eu_sales float8,
    jp_sales float8,
    other_sales float8    
);

-- import ConsoleGames csv file
COPY console_games FROM '/users/iolaleye/Downloads/database/ConsoleGames.csv' DELIMITER ',' CSV HEADER;

-- create console_dates table
CREATE TABLE console_dates (
    platform_name char(120),
    first_retail_availability date,
    discontinued date,
    units_sold_mill float8,
    platform_comment varchar(120)    
);

-- import ConsoleDates csv file
COPY console_dates FROM '/Users/iolaleye/Downloads/database/ConsoleDates.csv' DELIMITER ',' CSV HEADER;

-- add global sales column to console_games table
ALTER TABLE console_games
ADD COLUMN global_sales float8;

-- calculate global sales by combining north american, european, japan and other sales
UPDATE console_games
SET global_sales = na_sales + eu_sales + jp_sales + other_sales;

-------------------------------------------------
-- 1. Calculate what percentage of Global Sales were made in North America
-------------------------------------------------
ALTER TABLE console_games
ADD COLUMN na_sales_percent float8;

UPDATE console_games
SET na_sales_percent = na_sales / global_sales * 100
WHERE global_sales > 0;

-------------------------------------------------
-- 2. Extract a view of the console game titles ordered by platform name in ascending order and year of relase in descending order
-------------------------------------------------
SELECT *
FROM console_games
ORDER BY platform ASC, game_year DESC;
