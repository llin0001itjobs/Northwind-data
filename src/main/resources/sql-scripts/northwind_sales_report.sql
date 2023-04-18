-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table sales_report
--

DROP TABLE IF EXISTS sales_report;

CREATE TABLE sales_report (
  id int NOT NULL AUTO_INCREMENT,
  group_by varchar(50) NOT NULL,
  display varchar(50) DEFAULT NULL,
  title varchar(50) DEFAULT NULL,
  filter_row_source longtext,
  default_data tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table sales_report
--

LOCK TABLES sales_report WRITE;

INSERT INTO sales_report VALUES 
(1,'Category','Category','Sales By Category','SELECT DISTINCT [Category] FROM [products] ORDER BY [Category];',0),
(2,'country_region','Country/Region','Sales By Country','SELECT DISTINCT [country_region] FROM [customers Extended] ORDER BY [country_region];',0),
(3,'Customer ID','Customer','Sales By Customer','SELECT DISTINCT [Company] FROM [customers Extended] ORDER BY [Company];',0),
(4,'employee_id','Employee','Sales By Employee','SELECT DISTINCT [Employee Name] FROM [employees Extended] ORDER BY [Employee Name];',0),
(5,'Product ID','Product','Sales by Product','SELECT DISTINCT [Product Name] FROM [products] ORDER BY [Product Name];',1);

UNLOCK TABLES;
