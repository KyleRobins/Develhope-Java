SELECT
    PC.CategoryName,
    SUM(OI.Quantity * P.Price) AS TotalRevenue
FROM
    OrderItems OI
JOIN
    Products P ON OI.ProductID = P.ProductID
JOIN
    ProductCategories PC ON P.CategoryID = PC.CategoryID
GROUP BY
    PC.CategoryName
ORDER BY
    TotalRevenue DESC;
