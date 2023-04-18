--
-- Table structure for table inventory_transaction_type
--
DROP TABLE IF EXISTS inventory_transaction_type;

CREATE TABLE inventory_transaction_type (
  id int NOT NULL,
  type_name varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table inventory_transaction_type
--

LOCK TABLES inventory_transaction_type WRITE;

INSERT INTO inventory_transaction_type VALUES (1,'Purchased'),(2,'Sold'),(3,'On Hold'),(4,'Waste');

UNLOCK TABLES;
