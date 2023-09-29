-- Foreign Keys, INNER JOIN
-- Using the INGREDIENT and MEAL tables, write a query to return the name of all meals that contain garlic.
-- Using the INGREDIENT and MEAL tables, write a query to return the number of meals with vegetarian ingredients.
-- Using the INGREDIENT and MEAL tables, write a query to return the names of meals that have at least 1 gluten free ingredient and at least 1 vegan ingredient.
-- Using the INGREDIENT and MEAL tables, write a query to return the average number of ingredients per meal.
-- Using the INGREDIENT and MEAL tables, write a query to return the names of meals that have more than 3 ingredients.
-- We do not have data for the tables below, please just write the SQL you'd need to make the following joins!

-- Using the following table definitions, write an inner join for the two tables
-- CREATE TABLE CUSTOMER (
--     CUSTOMER_ID INT,
--     NAME VARCHAR(255),
--     ADDRESS VARCHAR(255)
-- );
-- CREATE TABLE ORDER (
--     ORDER_ID INT,
--     CUSTOMER_ID INT,
--     ORDER_DATE DATE,
--     TOTAL_COST DECIMAL(10,2)
-- );
-- Using the following table definitions, write an inner join for the two tables
-- CREATE TABLE PRODUCT (
--     PRODUCT_ID INT,
--     NAME VARCHAR(255),
--     PRICE DECIMAL(10,2)
-- );
-- CREATE TABLE INVENTORY (
--     PRODUCT_ID INT,
--     STORE_ID INT,
--     QUANTITY INT
-- );


SELECT DISTINCT M.NAME
FROM MEAL M
INNER JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
WHERE I.NAME = 'Garlic';


SELECT COUNT(DISTINCT M.MEAL_ID) AS Number_of_Meals
FROM MEAL M
INNER JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
WHERE I.VEGETARIAN = true;

SELECT DISTINCT M.NAME
FROM MEAL M
INNER JOIN INGREDIENT IG ON M.MEAL_ID = IG.MEAL_ID
WHERE IG.GLUTEN_FREE = true
  AND IG.VEGAN = true;


SELECT AVG(IngredientCount) AS Average_Ingredients_Per_Meal
FROM (
    SELECT M.MEAL_ID, COUNT(I.NAME) AS IngredientCount
    FROM MEAL M
    LEFT JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
    GROUP BY M.MEAL_ID
) AS IngredientCounts;


SELECT M.NAME
FROM MEAL M
LEFT JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
GROUP BY M.NAME
HAVING COUNT(I.NAME) > 3;


SELECT *
FROM CUSTOMER C
INNER JOIN ORDER O ON C.CUSTOMER_ID = O.CUSTOMER_ID;


SELECT *
FROM PRODUCT P
INNER JOIN INVENTORY I ON P.PRODUCT_ID = I.PRODUCT_ID;
