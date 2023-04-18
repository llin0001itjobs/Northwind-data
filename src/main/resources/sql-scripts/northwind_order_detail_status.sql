-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table order_detail_status
--

DROP TABLE IF EXISTS order_detail_status;

CREATE TABLE order_detail_status (
  id int NOT NULL,
  status_name varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table order_detail_status
--

LOCK TABLES order_detail_status WRITE;

INSERT INTO order_detail_status VALUES (0,'None'),(1,'Allocated'),(2,'Invoiced'),(3,'Shipped'),(4,'On Order'),(5,'No Stock');

UNLOCK TABLES;
