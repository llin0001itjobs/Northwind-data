-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table strings
--

DROP TABLE IF EXISTS strings;

CREATE TABLE strings (
  id int NOT NULL AUTO_INCREMENT,
  string_data varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table strings
--

LOCK TABLES strings WRITE;

INSERT INTO strings VALUES (2,'Northwind Traders'),(3,'Cannot remove posted inventory!'),(4,'Back ordered product filled for Order #|'),(5,'Discounted price below cost!'),(6,'Insufficient inventory.'),(7,'Insufficient inventory. Do you want to create a purchase order?'),(8,'Purchase orders were successfully created for | products'),(9,'There are no products below their respective reorder levels'),(10,'Must specify customer name!'),(11,'Restocking will generate purchase orders for all products below desired inventory levels.  Do you want to continue?'),(12,'Cannot create purchase order.  No suppliers listed for specified product'),(13,'Discounted price is below cost!'),(14,'Do you want to continue?'),(15,'Order is already invoiced. Do you want to print the invoice?'),(16,'Order does not contain any line items'),(17,'Cannot create invoice!  Inventory has not been allocated for each specified product.'),(18,'Sorry, there are no sales in the specified time period'),(19,'Product successfully restocked.'),(21,'Product does not need restocking! Product is already at desired inventory level.'),(22,'Product restocking failed!'),(23,'Invalid login specified!'),(24,'Must first select reported!'),(25,'Changing supplier will remove purchase line items, continue?'),(26,'Purchase orders were successfully submitted for | products.  Do you want to view the restocking report?'),(27,'There was an error attempting to restock inventory levels.'),(28,'| product(s) were successfully restocked.  Do you want to view the restocking report?'),(29,'You cannot remove purchase line items already posted to inventory!'),(30,'There was an error removing one or more purchase line items.'),(31,'You cannot modify quantity for purchased product already received or posted to inventory.'),(32,'You cannot modify price for purchased product already received or posted to inventory.'),(33,'Product has been successfully posted to inventory.'),(34,'Sorry, product cannot be successfully posted to inventory.'),(35,'There are orders with this product on back order.  Would you like to fill them now?'),(36,'Cannot post product to inventory without specifying received date!'),(37,'Do you want to post received product to inventory?'),(38,'Initialize purchase, orders, and inventory data?'),(39,'Must first specify employee name!'),(40,'Specified user must be logged in to approve purchase!'),(41,'Purchase order must contain completed line items before it can be approved'),(42,'Sorry, you do not have permission to approve purchases.'),(43,'Purchase successfully approved'),(44,'Purchase cannot be approved'),(45,'Purchase successfully submitted for approval'),(46,'Purchase cannot be submitted for approval'),(47,'Sorry, purchase order does not contain line items'),(48,'Do you want to cancel this order?'),(49,'Canceling an order will permanently delete the order.  Are you sure you want to cancel?'),(100,'Your order was successfully canceled.'),(101,'Cannot cancel an order that has items received and posted to inventory.'),(102,'There was an error trying to cancel this order.'),(103,'The invoice for this order has not yet been created.'),(104,'Shipping information is not complete.  Please specify all shipping information and try again.'),(105,'Cannot mark as shipped.  Order must first be invoiced!'),(106,'Cannot cancel an order that has already shipped!'),(107,'Must first specify salesperson!'),(108,'Order is now marked closed.'),(109,'Order must first be marked shipped before closing.'),(110,'Must first specify payment information!'),(111,'There was an error attempting to restock inventory levels.  | product(s) were successfully restocked.'),(112,'You must supply a Unit Cost.'),(113,'Fill back ordered product, Order #|'),(114,'Purchase generated based on Order #|');

UNLOCK TABLES;
