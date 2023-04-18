-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table product_supplier
--

DROP TABLE IF EXISTS product_supplier;

CREATE TABLE product_supplier (
  id int NOT NULL,
  product_id int NOT NULL,
  supplier_id int NOT NULL,
  PRIMARY KEY (id),
  KEY id (id),
  KEY product_id (product_id),
  KEY supplier_id (supplier_id),
  CONSTRAINT fk_product_supplier_product1 FOREIGN KEY (product_id) REFERENCES product (id),
  CONSTRAINT fk_product_supplier_supplier1 FOREIGN KEY (supplier_id) REFERENCES supplier (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;
--
-- Dumping data for table product_supplier
--
LOCK TABLES product_supplier WRITE;

INSERT INTO product_supplier VALUES 
(1,19,1),(2,21,1),(3,52,1),(4,56,1),(5,57,1),(6,82,1),(7,85,1),(8,86,1),(9,97,1),
(10,6,2),(11,7,2),(12,14,2),(13,20,2),(14,51,2),(15,74,2),(16,80,2),(50,19,2),
(17,43,3),(18,81,3),(51,21,2),
(19,1,4),(20,34,4),(21,43,4),
(22,72,5),
(23,6,6),(24,17,6),(25,20,6),(26,41,6),(27,74,6),(28,88,6),(29,89,6),(30,90,6),
(31,91,6),(32,92,6),(33,93,6),(34,94,6),(35,98,6),(36,99,6),
(37,40,7),(38,87,7),(39,95,7),(40,96,7),
(41,8,8),(42,65,8),(43,66,8),
(44,83,9),
(45,3,10),(46,4,10),(47,5,10),(48,48,10),(49,77,10);


UNLOCK TABLES;
