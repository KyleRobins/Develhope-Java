-- Date, Timestamp, Select Functions
-- Use all of the functions below, find out what they do, write a description for them here or in the comments of the code. Add a meaningful column alias

-- CONCAT(COLUMN1, COLUMN2) AS ALIAS_NAME
--  LOWER(COLUMN)
--  UPPER(COLUMN)
--  TRIM(COLUMN)
--  LENGTH(COLUMN)
--  SUBSTRING(COLUMN, START, LENGTH)
--  ROUND(COLUMN, DECIMAL_PLACES)
--  DATE_ADD(COLUMN, INTERVAL EXPRESSION UNIT)
--  DATE_SUB(COLUMN, INTERVAL EXPRESSION UNIT)
--  FORMAT(COLUMN, FORMAT_STRING)
-- Using DATE_ADD or DATE_SUB and the following SQL

-- SELECT NOW();

-- Select your birthday by passing the result into the next item

-- i.e. DATE_ADD(DATE_ADD(NOW(), INTERVAL 7 DAY), INTERVAL 2 MONTH) as BIRTHDAY_DATE

-- If you're feeling really adventurous try to get the time to exactly midnight!


 --Descriptions and examples of the SQL functions :

1. CONCAT(COLUMN1, COLUMN2) AS ALIAS_NAME
--    - Description: This function concatenates two columns (or strings) together.
--    - Example: `CONCAT(First_Name, Last_Name) AS Full_Name`

2. LOWER(COLUMN)
--    - Description: This function converts the characters in a column to lowercase.
--    - Example: `LOWER(First_Name) AS Lowercase_Name`

3. UPPER(COLUMN)
--    - Description: This function converts the characters in a column to uppercase.
--    - Example: `UPPER(Last_Name) AS Uppercase_Last_Name`

4. TRIM(COLUMN)
--    - Description: This function removes leading and trailing whitespace from a column.
--    - Example: `TRIM(Description) AS Trimmed_Description`

5. LENGTH(COLUMN)
--    - Description: This function returns the length (number of characters) of a column.
--    - Example: `LENGTH(Email) AS Email_Length`

6. SUBSTRING(COLUMN, START, LENGTH)
--    - Description: This function extracts a substring from a column, starting at the specified position (START) and with the specified length (LENGTH).
--    - Example: `SUBSTRING(Phone_Number, 1, 3) AS Area_Code`

7. ROUND(COLUMN, DECIMAL_PLACES)
--    - Description: This function rounds the numeric values in a column to the specified number of decimal places.
--    - Example: `ROUND(Price, 2) AS Rounded_Price`

8. DATE_ADD(COLUMN, INTERVAL EXPRESSION UNIT)
--    - Description: This function adds a specified interval to a date or datetime column.
--    - Example: `DATE_ADD(Current_Date, INTERVAL 7 DAY) AS Future_Date`

9. DATE_SUB(COLUMN, INTERVAL EXPRESSION UNIT)
--    - Description: This function subtracts a specified interval from a date or datetime column.
--    - Example: `DATE_SUB(Current_Date, INTERVAL 2 MONTH) AS Past_Date`

10. FORMAT(COLUMN, FORMAT_STRING)
    -- - Description: This function formats a column value using the specified format string.
    -- - Example: `FORMAT(Salary, '$#,###.##') AS Formatted_Salary`

--To find your birthday by passing the result into the next item and set the time to midnight:

```sql
SELECT DATE_ADD(DATE_ADD(NOW(), INTERVAL 7 DAY), INTERVAL 2 MONTH) AS BIRTHDAY_DATE;
```

--This query will calculate your birthday by adding 7 days and 2 months to the current date and time, and it will set the time to midnight (00:00:00).