-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table order_tax_status
--

DROP TABLE IF EXISTS order_tax_status;

CREATE TABLE order_tax_status (
  id int NOT NULL,
  tax_status_name varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table order_tax_status
--

LOCK TABLES order_tax_status WRITE;

INSERT INTO order_tax_status VALUES (0,'Tax Exempt'),(1,'Taxable');

UNLOCK TABLES;
