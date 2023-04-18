-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table purchase_order_status
--

DROP TABLE IF EXISTS purchase_order_status;

CREATE TABLE purchase_order_status (
  id int NOT NULL,
  status varchar(64) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table purchase_order_status
--

LOCK TABLES purchase_order_status WRITE;

INSERT INTO purchase_order_status VALUES (0,'New'),(1,'Submitted'),(2,'Approved'),(3,'Closed');

UNLOCK TABLES;
