--
-- Table structure for table supplier
--

DROP TABLE IF EXISTS supplier;

CREATE TABLE supplier (
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
  CONSTRAINT fk_supplier_company1 FOREIGN KEY (company_id) REFERENCES company (id) ON DELETE NO ACTION ON UPDATE NO ACTION	 
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table supplier
--

LOCK TABLES supplier WRITE;

INSERT INTO supplier VALUES 
(1,1,'Andersen','Elizabeth A.','eae0001@gmail.com','Sales Manager','703-555-0123',NULL,NULL,NULL,NULL,'Alexandria','VA','22305',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(2,6,'Weiler','Cornelia','corn_weil02@outlook.com','Sales Manager','202-555-0456',NULL,NULL,NULL,NULL,'Washington','D.C.','20001',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(3,10,'Kelley','Madeleine','mad_kelley416@outlook.com','Sales Representative','212-555-2223',NULL,NULL,NULL,NULL,'Manhattan','NY','10277',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(4,9,'Sato','Naoki','sato-naoki-13@yahoo.com','Marketing Manager','404-555-0789',NULL,NULL,NULL,NULL,'Atlanta','GA','30307',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(5,6,'Hernandez-Echevarria','Amaya','mgmt@outlook.com','Sales Manager','202-555-6117',NULL,NULL,NULL,NULL,'Washington','D.C.','20001',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(6,9,'Hayakawa','Satomi','sat0-16417@yahoo.com','Marketing Assistant','404-555-9001',NULL,NULL,NULL,NULL,'Atlanta','GA','30307',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(7,10,'Glasson','Stuart','stu-glass-007@outlook.com','Marketing Manager','212-555-3808',NULL,NULL,NULL,NULL,'Manhattan','NY','10277',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(8,6,'Dunton','Bryn Paul','sales_rep_0012@outlook.com','Sales Representative','202-555-4145',NULL,NULL,NULL,NULL,'Washington','D.C.','20002',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(9,9,'Sandberg','Mikael','mgmt01@yahoo.com','Sales Manager','404-555-8179',NULL,NULL,NULL,NULL,'Atlanta','GA','30307',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(10,9,'Sousa','Luis','mgmt05@yahoo.com','Sales Manager','404-555-9110',NULL,NULL,NULL,NULL,'Atlanta','GA','30307',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

UNLOCK TABLES;
