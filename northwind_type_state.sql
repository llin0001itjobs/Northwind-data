-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table type_state
--

DROP TABLE IF EXISTS type_state;

CREATE TABLE type_state (
  id int NOT NULL AUTO_INCREMENT,
  code varchar(2) NOT NULL,
  description varchar(45) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table type_state
--

LOCK TABLES type_state WRITE;

INSERT INTO type_state VALUES (1,'AK','Alaska'),(2,'AL','Alabama'),(3,'AR','Arkansas'),(4,'AZ','Arizona'),(5,'CA','California'),(6,'CO','Colorado'),(7,'CT','Connecticut'),(8,'DE','Delaware'),
(9,'FL','Florida'),(10,'GA','Georgia'),(11,'HI','Hawaii'),(12,'IA','Iowa'),(13,'ID','Idaho'),(14,'IL','Illinois'),(15,'IN','Indiana'),(16,'KS','Kansas'),(17,'KY','Kentucky'),(18,'LA','Louisana'),(19,'MA','Massacheusetts'),(20,'MD','Maryland'),(21,'ME','Maine'),(22,'MI','Michigan'),(23,'MN','Minnesota'),(24,'MO','Missouri'),(25,'MS','Mississippi'),(26,'MT','Montana'),(27,'NC','North Carolina'),(28,'ND','North Dakota'),(29,'NE','Nebraska'),(30,'NH','New Hampshire'),(31,'NJ','New Jersey'),(32,'NM','New Mexico'),(33,'NV','Nevada'),(34,'NY','New York'),(35,'OH','Ohio'),(36,'OK','Oklahoma'),(37,'OR','Oregon'),(38,'PA','Pennsylvania'),(39,'RI','Rhode Island'),(40,'SC','South Carolina'),(41,'SD','South Dakota'),(42,'TN','Tennessee'),(43,'TX','Texas'),(44,'UT','Utah'),(45,'VI','Virginia'),(46,'VT','Vermont'),(47,'WA','Washington'),(48,'WI','Wisconsin'),(49,'WV','West Virginia'),(50,'WY','Wyoming');

UNLOCK TABLES;
