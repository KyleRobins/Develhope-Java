-- Create Table
-- Using the "Ingredient" table from the What is a Database video, write and run your own CREATE TABLE SQL statement, ensure all columns are appropriate types

-- If you create a table incorrectly and want to delete it type DROP TABLE INGREDIENT.

-- Also make sure there are semi colons after your Create table statements, otherwise there may be errors!

-- Good luck!

CREATE TABLE INGREDIENTS(
NAME VARCHAR (255),
CONTAIN_LACTOSE BOOLEAN,
VEGETARIAN BOOLEAN,
VEGAN BOOLEAN,
GLUTEN_FREE BOOLEAN,
);


INSERT INTO INGREDIENTS(NAME,CONTAIN_LACTOSE,VEGETARIAN,VEGAN,GLUTEN_FREE)
VALUES("sphagheti",false,true,false,true);
INSERT INTO INGRIDIENTS(NAME,CONTAIN_LACTOSE,VEGETERIAN,VEGAN,GLUTEN_FREE)
VALUES("Bread",true,true,true,false);
INSERT INTO INGRIDIENTS(NAME,CONTAIN_LACTOSE,VEGETERIAN,VEGAN,GLUTEN_FREE)
VALUES("Beefparty",true,false,false,true);

//To delete a table 

DROP TABLE INGREDIENTS;