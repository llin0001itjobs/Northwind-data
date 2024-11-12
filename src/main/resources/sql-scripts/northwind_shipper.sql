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

INSERT INTO shipper VALUES 
    (1,13,'Haiser','Kimberly','info@officedepot.com','Manager',NULL,NULL,NULL,NULL,'6600 North Military Trail','Boca Raton','FL','33496','USA','Office Depot, Inc. (NASDAQ:ODP) is a leading provider of business services and supplies, products and technology solutions through its fully integrated omni-channel platform of approximately 1,400 stores, online presence, and dedicated sales professionals and technicians to small, medium and enterprise businesses.',NULL,NULL,NULL,NULL,NULL),
	(2,13,'Simtha','Bob','pr@cinemark.com','Manager',NULL,NULL,NULL,NULL,'3200 Airport Rd.','Boca Raton','FL','33431','USA','Cinemark is proud to exhibit a variety of content, from the latest blockbusters to special live events, and has a strategically built portfolio of brands to reach movie lovers across the country, including Century Theatres, Rave Cinemas, Tinseltown USA and CinéArts.',NULL,NULL,NULL,NULL,NULL),
	(3,13,'Jones','Doug','customer.service@uline.com','Customer Representative','1-800-295-5510',NULL,NULL,'1-800-295-5571','12575 Uline Drive','Pleasant Prairie','WI','53158','USA','Uline, a family-owned business, is the leading distributor of shipping, industrial and packaging materials to businesses throughout North America. For over 40 years, we''ve stayed committed to providing the highest levels of service and quality products to our customers. Depend on Uline to build your business — we won''t let you down.',NULL,NULL,NULL,NULL,NULL);

UNLOCK TABLES;


  


