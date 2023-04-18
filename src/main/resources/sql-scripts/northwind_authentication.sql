
DROP TABLE IF EXISTS authentication;
CREATE TABLE authentication (
  id int NOT NULL,
  role_type varchar(64) NOT NULL DEFAULT '0',
  user_name varchar(256) DEFAULT NULL,
  password varchar(256) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table authentication
--

LOCK TABLES authentication WRITE;

INSERT INTO authentication VALUES (1,'USER','MyrTkkFOL5AHSQfZhzo74w==','o7Q1KoXVrH7WvEMUoMI1gA=='),(2,'USER','VTGN1ljR6fbXlborxtZzBQ==','VTGN1ljR6fbXlborxtZzBQ==');

UNLOCK TABLES;




