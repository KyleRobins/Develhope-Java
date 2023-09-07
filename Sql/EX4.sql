-- Create Table As, Insert via query, Create View
-- Using a CREATE TABLE AS statement, create a new table called 'CHEAP_MEALS' that contains all meals with a price less than €15.
-- Using an INSERT statement with a SELECT statement, insert all ingredients that are vegan into a new table called 'VEGAN_INGREDIENT', you can create an empty clone of a table with the following code:
-- CREATE TABLE VEGAN_INGREDIENT AS 
-- SELECT * FROM INGREDIENT WHERE FALSE
-- Using a CREATE VIEW statement, create a view called 'EXPENSIVE_MEAL' that shows all meals with a price greater than €15.
-- Using a CREATE VIEW statement, create a view called 'LACTOSE_FREE_INGREDIENT' that shows all any ingredients without lactose.
-- Using a CREATE TABLE AS statement, create a new table called 'HIGH_CALORIE_MEAL' that contains all meals with more than 650 calories.


-- Where
-- Using a SELECT statement with a WHERE clause, retrieve all meals that have a price less than €15
-- Using a SELECT statement with a WHERE clause, retrieve all ingredients that are vegetarian.
-- Using a SELECT statement with a WHERE clause, retrieve all meals that have more than 500 calories.
-- Using a SELECT statement with a WHERE clause, retrieve all meals that have a price between €15 and €16.
-- Using a SELECT statement with a WHERE clause, retrieve all ingredients that are both lactose-free (note lactose FREE) and gluten-free.
-- Using a SELECT statement with a WHERE clause and logical operator(s), retrieve all meals that have a price less than €15 or more than 600 calories.
-- Using a SELECT statement with a WHERE clause, retrieve all ingredients that are vegan or gluten-free
-- Using a SELECT statement with a WHERE clause, retrieve all meals with the name 'Pesto Pasta'
-- Using a SELECT statement with a WHERE clause, retrieve all ingredients that are not lactose-free
-- Using a SELECT statement with a WHERE clause and a logical operator, retrieve all meals that have a price more than €20 and less than 800 calories.

--Creating statements
CREATE TABLE CHEAP_MEALS AS
SELECT * FROM MEALS
WHERE PRICE < 15;

CREATE VIEW EXPENSIVE_MEAL AS
SELECT * FROM MEALS
WHERE PRICE > 15;

CREATE VIEW LACTOSE_FREE_INGREDIENT AS
SELECT * FROM INGREDIENTS
WHERE CONTAIN_LACTOSE = false;

CREATE TABLE HIGH_CALORIE_MEAL AS
SELECT * FROM MEALS
WHERE CALORIES > 650;

--insert Statements
INSERT INTO VEGAN_INGREDIENT
SELECT * FROM INGREDIENTS
WHERE VEGAN = true;


