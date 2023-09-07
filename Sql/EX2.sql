-- Insert and Select
-- Write insert statements to insert the following 5 ingredients:
-- Eggs
-- Bread
-- Beef Patty
-- Lettuce
-- Yoghurt
-- Write a SELECT statement to select the NAME of all the ingredients.
-- Write a SELECT statement to select the NAME and the PRICE of the ingredients
-- Write a SELECT statement to select all columns of ingredients, ordered by NAME
-- Write a SELECT statement to select all columns of ingredients, ordered by "GLUTEN_FREE" with the "true" items on top

--Creating a table
CREATE TABLE INGREDIENTS(
NAME VARCHAR (255),
PRICE DOUBLE,
CONTAIN_LACTOSE BOOLEAN,
VEGETARIAN BOOLEAN,
VEGAN BOOLEAN,
GLUTEN_FREE BOOLEAN,
);

--insert Statements
INSERT INTO INGREDIENTS(NAME,CONTAIN_LACTOSE,VEGETARIAN,VEGAN,GLUTEN_FREE)
VALUES("Eggs",false,true,false,true);
INSERT INTO INGRIDIENTS(NAME,CONTAIN_LACTOSE,VEGETERIAN,VEGAN,GLUTEN_FREE)
VALUES("Bread",true,true,true,false);
INSERT INTO INGRIDIENTS(NAME,CONTAIN_LACTOSE,VEGETERIAN,VEGAN,GLUTEN_FREE)
VALUES("Beefparty",true,false,false,true);
INSERT INTO INGRIDIENTS(NAME,CONTAIN_LACTOSE,VEGETERIAN,VEGAN,GLUTEN_FREE)
VALUES("Lettuce",true,false,false,true);
INSERT INTO INGRIDIENTS(NAME,CONTAIN_LACTOSE,VEGETERIAN,VEGAN,GLUTEN_FREE)
VALUES("Yorghurt",true,false,false,true);

--Select Statements
SELECT NAME FROM INGREDIENTS;
SELECT NAME,PRICE FROM INGREDIENTS;
SELECT * INGREDIENTS
ORDER BY NAME;

SELECT * INGREDIENTS
ORDER BY GLUTEN_FREE DESC;



