-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table shipper
--

DROP TABLE IF EXISTS shipper;

CREATE TABLE shipper (
  id int NOT NULL AUTO_INCREMENT,
  company_id int DEFAULT '1',  
  last_name varchar(50) DEFAULT NULL,
  first_name varchar(50) DEFAULT NULL,
  email_address varchar(50) DEFAULT NULL,
  job_title varchar(50) DEFAULT NULL,
  business_phone varchar(25) DEFAULT NULL,
  home_phone varchar(25) DEFAULT NULL,
  mobile_phone varchar(25) DEFAULT NULL,
  fax_number varchar(25) DEFAULT NULL,
  address1 varchar(256) DEFAULT NULL,
  city varchar(50) DEFAULT NULL,
  state_province varchar(50) DEFAULT NULL,
  zip_postal_code varchar(15) DEFAULT NULL,
  country_region varchar(50) DEFAULT NULL,
  notes longtext,
  address2 varchar(256) DEFAULT NULL,
  web_site_url varchar(1024) DEFAULT NULL,
  web_site_title varchar(256) DEFAULT NULL,
  portrait_path varchar(1024) DEFAULT NULL,
  portrait_title varchar(256) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY company_id (company_id),
  CONSTRAINT fk_shipper_company1 FOREIGN KEY (company_id) REFERENCES company (id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table shipper
--

LOCK TABLES shipper WRITE;

INSERT INTO shipper VALUES (1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123 Any Street','Memphis','TN','99999','USA',NULL,10,NULL,NULL,NULL,NULL,NULL),
	(2,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123 Any Street','Memphis','TN','99999','USA',NULL,10,NULL,NULL,NULL,NULL,NULL),
	(3,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123 Any Street','Springfield','WA','98106','USA',NULL,9,NULL,NULL,NULL,NULL,NULL);

UNLOCK TABLES;
