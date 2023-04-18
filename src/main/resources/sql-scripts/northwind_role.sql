--
-- Table structure for table role
--

DROP TABLE IF EXISTS role;

CREATE TABLE role (
  type varchar(64) NOT NULL,
  description varchar(64) NOT NULL,
  PRIMARY KEY (type)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table role
--

LOCK TABLES role WRITE;

INSERT INTO role VALUES ('ADMIN','Administrator'),('USER','Default User');

UNLOCK TABLES;
