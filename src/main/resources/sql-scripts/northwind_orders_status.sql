-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table orders_status
--

DROP TABLE IF EXISTS orders_status;

CREATE TABLE orders_status (
  id int NOT NULL,
  status_name varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table orders_status
--

LOCK TABLES orders_status WRITE;

INSERT INTO orders_status VALUES (0,'New'),(1,'Invoiced'),(2,'Shipped'),(3,'Closed');

UNLOCK TABLES;
