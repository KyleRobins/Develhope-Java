-- Grouping By, Count, Sum
-- Using a SELECT statement with a GROUP BY clause and COUNT function, retrieve the number of orders for each meal.
-- Using a SELECT statement with a WHERE clause and SUM function, retrieve the total revenue for all meals that have a price greater than €15.
-- Using a SELECT statement with a GROUP BY clause and COUNT function, retrieve the number of meals that have more than 500 calories.
-- Using a SELECT statement with a WHERE clause and SUM function, retrieve the total price for all meals that have a name containing the letter 'S'.
-- You can find items that start with the letter s with the following where clause
-- WHERE LOWER(NAME) LIKE '%s%';
-- Using a SELECT statement with a WHERE clause, GROUP BY clause, and COUNT function, retrieve the number of orders for each meal that were ordered before '202X-XX-XX 18:00:00' (Replace the Xs with your current date)

SELECT MEALS.NAME, COUNT(ORDERS.ORDER_ID) AS Number_of_Orders
FROM MEALS
LEFT JOIN ORDERS ON MEALS.MEAL_ID = ORDERS.MEAL_ID
GROUP BY MEALS.NAME;

SELECT SUM(PRICE) AS Total_Revenue
FROM MEALS
WHERE PRICE > 15;


SELECT CALORIES, COUNT(*) AS Number_of_Meals
FROM MEALS
WHERE CALORIES > 500
GROUP BY CALORIES;

SELECT MEALS.NAME, SUM(MEALS.PRICE) AS Total_Price
FROM MEALS
WHERE LOWER(MEALS.NAME) LIKE '%s%'
GROUP BY MEALS.NAME;

SELECT MEALS.NAME, COUNT(ORDERS.ORDER_ID) AS Number_of_Orders
FROM MEALS
LEFT JOIN ORDERS ON MEALS.MEAL_ID = ORDERS.MEAL_ID
WHERE ORDERS.ORDER_DATE < '2023-09-07 18:00:00'
GROUP BY MEALS.NAME;

