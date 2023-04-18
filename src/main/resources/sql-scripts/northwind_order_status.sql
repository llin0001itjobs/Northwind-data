-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table order_status
--

DROP TABLE IF EXISTS order_status;

CREATE TABLE order_status (
  id int NOT NULL,
  status_name varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table order_status
--

LOCK TABLES order_status WRITE;

INSERT INTO order_status VALUES (0,'New'),(1,'Invoiced'),(2,'Shipped'),(3,'Closed');

UNLOCK TABLES;
