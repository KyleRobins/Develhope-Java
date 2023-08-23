SELECT
    CONCAT(C.FirstName, ' ', C.LastName) AS CustomerName,
    O.OrderDate,
    O.TotalAmount
FROM
    Customers AS C
JOIN
    Orders AS O ON C.CustomerID = O.CustomerID
ORDER BY
    O.OrderDate DESC;
