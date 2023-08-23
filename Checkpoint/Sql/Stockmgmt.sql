-- Creating the trigger
DELIMITER //
CREATE TRIGGER AfterOrderInsert
AFTER INSERT ON Orders
FOR EACH ROW
BEGIN
    DECLARE ProductID INT;
    DECLARE Quantity INT;
    
    -- Get the ProductID and Quantity from the inserted order
    SELECT ProductID, Quantity INTO ProductID, Quantity
    FROM OrderItems
    WHERE OrderID = NEW.OrderID;
    
    -- Update the stock quantity of the product
    UPDATE Products
    SET StockQuantity = StockQuantity - Quantity
    WHERE ProductID = ProductID;
END;
//
DELIMITER ;
