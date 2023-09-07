-- Max, Min, Average, Having
-- Write a query to find the maximum price of a meal with more than 500 calories.
-- Write a query to find the average calories of meals that cost more than 15 EUR
-- Write a query to select all meals that have the MAX price, using HAVING and MAX()
-- Write a query to select all meals that have a price lower than the average price, using HAVING and AVG
-- Write a query to select all meals that have a price lower than the average price and have more than 600 calories


SELECT MAX(PRICE) AS Max_Price
FROM MEALS
WHERE CALORIES > 500;

SELECT AVG(CALORIES) AS Average_Calories
FROM MEALS
WHERE PRICE > 15;

SELECT NAME, MAX(PRICE) AS Max_Price
FROM MEALS
GROUP BY NAME
HAVING PRICE = MAX(PRICE);

SELECT NAME, PRICE
FROM MEALS
GROUP BY NAME, PRICE
HAVING PRICE < (SELECT AVG(PRICE) FROM MEALS);

SELECT NAME, PRICE, CALORIES
FROM MEALS
GROUP BY NAME, PRICE, CALORIES
HAVING PRICE < (SELECT AVG(PRICE) FROM MEALS) AND CALORIES > 600;

