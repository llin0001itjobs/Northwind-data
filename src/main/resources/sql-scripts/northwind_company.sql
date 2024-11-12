--
-- Table structure for table company
--
DROP TABLE IF EXISTS company;

CREATE TABLE company (
  id int NOT NULL,
  name varchar(256) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY id_UNIQUE (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table company
--

LOCK TABLES company WRITE;

INSERT INTO company VALUES (1,'None'),(2,'Springfield Elementary School'),(3,'Springfield DMV'),(4,'Springfield Nuclear Power Plant'),(5,'Moe\'s Tavern'),(6,'Kwik-E-Mart'),(7,'Planet Express'),(8,'The Leftorium'),(9,'Spingfield Shippers'),(10,'Expert Shipping Solutions'),(11,'Democratic Order Of Planets'),(12,'The Krusty the Clown Show'),(13,'Other');

UNLOCK TABLES;
