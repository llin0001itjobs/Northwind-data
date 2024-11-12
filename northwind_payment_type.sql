-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log


--
-- Table structure for table payment_type
--
DROP TABLE IF EXISTS payment_type;

CREATE TABLE payment_type (
  id int NOT NULL AUTO_INCREMENT,
  type varchar(64) NOT NULL,
  description varchar(64) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY type_UNIQUE (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table companies
--

LOCK TABLES payment_type WRITE;

INSERT INTO payment_type VALUES (1,'CASH','Cash'),(2,'CHECK','Check'),(3,'CREDIT','Credit Card');

UNLOCK TABLES;

-- Dump completed on 2018-05-07 12:31:49
