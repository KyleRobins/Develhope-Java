DELETE FROM Customers
WHERE CustomerID NOT IN (
    SELECT O.CustomerID
    FROM Orders O
    WHERE O.OrderDate >= DATE_SUB(NOW(), INTERVAL 1 YEAR)
);
