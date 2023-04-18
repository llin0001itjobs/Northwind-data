--
-- Table structure for table user
--

DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id int NOT NULL,
  user varchar(64) DEFAULT NULL,
  password varchar(64) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY id_UNIQUE (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table user
--

LOCK TABLES user WRITE;

UNLOCK TABLES;
