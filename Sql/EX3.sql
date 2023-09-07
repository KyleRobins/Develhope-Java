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

--Creating tables
CREATE TABLE MEALS(
    NAME VARCHAR (255)
    PRICE DOUBLE,
    CALORIES INT,
);

CREATE TABLE INGREDIENTS(
NAME VARCHAR (255),
PRICE DOUBLE,
CONTAIN_LACTOSE BOOLEAN,
VEGETARIAN BOOLEAN,
VEGAN BOOLEAN,
GLUTEN_FREE BOOLEAN,
);

--insert Statements
INSERT INTO MEALS(NAME,PRICE,CALORIES)
VALUES ("pizza", 23, 600);
INSERT INTO MEALS(NAME,PRICE,CALORIES)
VALUES ("omlette", 35, 450);
INSERT INTO MEALS(NAME,PRICE,CALORIES)
VALUES ("burger", 53, 670);
INSERT INTO MEALS(NAME,PRICE,CALORIES)
VALUES ("steak", 78, 300);
INSERT INTO MEALS(NAME,PRICE,CALORIES)
VALUES ("cake", 25, 100);
INSERT INTO MEALS(NAME,PRICE,CALORIES)
VALUES ("Pesto Pasta", 25, 45);

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

--select statements

SELECT * FROM MEALS
WHERE CALORIES > 500;

SELECT * FROM MEALS
WHERE PRICE BETWEEN 15 AND 16;

SELECT * FROM INGREDIENTS
WHERE CONTAIN_LACTOSE = false AND GLUTEN_FREE = true;

SELECT * FROM MEALS
WHERE PRICE < 15 OR CALORIES > 600;

SELECT * FROM INGREDIENTS
WHERE VEGAN = true OR GLUTEN_FREE = true;

SELECT * FROM MEALS
WHERE NAME = 'Pesto Pasta';

SELECT * FROM INGREDIENTS
WHERE CONTAIN_LACTOSE = true;

SELECT * FROM MEALS
WHERE PRICE > 20 AND CALORIES < 800;