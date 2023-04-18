--
-- Table structure for table orders_tax_status
--

DROP TABLE IF EXISTS orders_tax_status;

CREATE TABLE orders_tax_status (
  id int NOT NULL,
  tax_status_name varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table orders_tax_status
--

LOCK TABLES orders_tax_status WRITE;

INSERT INTO orders_tax_status VALUES (0,'Tax Exempt'),(1,'Taxable');

UNLOCK TABLES;
