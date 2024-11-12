--
-- Table structure for table role
--

DROP TABLE IF EXISTS role;

CREATE TABLE role (
  id int NOT NULL AUTO_INCREMENT,
  type varchar(64) NOT NULL,
  description varchar(64) NOT NULL,
  PRIMARY KEY (type)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table role
--

LOCK TABLES role WRITE;

INSERT INTO role VALUES (1,'ADMIN','Administrator'),(2,'USER','Default User');

UNLOCK TABLES;
