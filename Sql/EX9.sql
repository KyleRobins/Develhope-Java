-- Primary keys, UPDATE, DELETE FROM, TRUNCATE, DROP TABLE
-- Create your own customers table, make sure you create it with an auto_increment primary key.
-- Insert some customers with an insert statement.
-- Edit these customers using the UPDATE statement with a WHERE clause referring to the id.
-- Delete some customers with delete from statement with a WHERE clause referring to the id.
-- Delete all customers with a truncate statement.
-- Look at the tables below and write which column(s) you think would make a good primary key.

-- Question

-- CREATE TABLE Customers (
--  customer_id INT NOT NULL AUTO_INCREMENT,
--  first_name VARCHAR(255) NOT NULL,
--  last_name VARCHAR(255) NOT NULL,
--  email VARCHAR(255) NOT NULL,
--  PRIMARY KEY (customer_id)
-- );
-- Question

-- CREATE TABLE Products (
--  product_name VARCHAR(255) NOT NULL,
--  product_description VARCHAR(255) NOT NULL,
--  product_price DECIMAL(10, 2) NOT NULL,
--  product_quantity INT NOT NULL
-- );
-- Question

-- CREATE TABLE Orders (
--  order_id INT NOT NULL AUTO_INCREMENT,
--  customer_id INT NOT NULL,
--  expected_arrival_time DATE
-- );
-- 9 - Question

-- CREATE TABLE Product_Orders (
--  order_id INT NOT NULL AUTO_INCREMENT,
--  product_name VARCHAR(255) NOT NULL,
--  total_revenue DOUBLE
-- );

CREATE TABLE Customers (
 customer_id INT NOT NULL AUTO_INCREMENT,
 first_name VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 email VARCHAR(255) NOT NULL,
 PRIMARY KEY (customer_id)
);


CREATE TABLE Products (
 product_name VARCHAR(255) NOT NULL,
 product_description VARCHAR(255) NOT NULL,
 product_price DECIMAL(10, 2) NOT NULL,
 product_quantity INT NOT NULL
);


CREATE TABLE Orders (
 order_id INT NOT NULL AUTO_INCREMENT,
 customer_id INT NOT NULL,
 expected_arrival_time DATE
);

CREATE TABLE Product_Orders (
 order_id INT NOT NULL AUTO_INCREMENT,
 product_name VARCHAR(255) NOT NULL,
 total_revenue DOUBLE
);

