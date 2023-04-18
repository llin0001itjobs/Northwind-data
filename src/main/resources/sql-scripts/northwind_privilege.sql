--
-- Table structure for table privilege
--

DROP TABLE IF EXISTS privilege;

CREATE TABLE privilege (
  id int NOT NULL AUTO_INCREMENT,
  privilege_name varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table privilege
--

LOCK TABLES privilege WRITE;

INSERT INTO privilege VALUES (1,'None'),(2,'Purchase Approvals');

UNLOCK TABLES;
