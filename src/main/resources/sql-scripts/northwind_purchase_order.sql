-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table purchase_order
--

DROP TABLE IF EXISTS purchase_order;

CREATE TABLE purchase_order (
  id int NOT NULL AUTO_INCREMENT,
  supplier_id int DEFAULT NULL,
  created_by int DEFAULT NULL,
  submitted_date datetime DEFAULT NULL,
  creation_date datetime DEFAULT NULL,
  status_id int DEFAULT '0',
  expected_date datetime DEFAULT NULL,
  shipping_fee decimal(19,4) NOT NULL DEFAULT '0.0000',
  taxes decimal(19,4) NOT NULL DEFAULT '0.0000',
  payment_date datetime DEFAULT NULL,
  payment_amount decimal(19,4) DEFAULT '0.0000',
  payment_method varchar(64) DEFAULT NULL,
  notes longtext,
  approved_by int DEFAULT NULL,
  approved_date datetime DEFAULT NULL,
  submitted_by int DEFAULT NULL,
  PRIMARY KEY (id),
  KEY supplier_id (supplier_id),
  KEY created_by (created_by),
  KEY status_id (status_id),
  KEY approved_by (approved_by),
  KEY submitted_by (submitted_by),
  CONSTRAINT fk_purchase_order_supplier1 FOREIGN KEY (supplier_id) REFERENCES supplier (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_purchase_order_employee1 FOREIGN KEY (created_by) REFERENCES employee (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_purchase_order_purchase_order_status1 FOREIGN KEY (status_id) REFERENCES purchase_order_status (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_purchase_order_employee2 FOREIGN KEY (approved_by) REFERENCES employee (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_purchase_order_employee3 FOREIGN KEY (submitted_by) REFERENCES employee (id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table purchase_order
--

LOCK TABLES purchase_order WRITE;

INSERT INTO purchase_order VALUES (90,1,2,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-01-22 00:00:00',2),
(91,3,2,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-01-22 00:00:00',2),
(92,2,2,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-01-22 00:00:00',2),
(93,5,2,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-01-22 00:00:00',2),
(94,6,2,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-01-22 00:00:00',2),
(95,4,2,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-01-22 00:00:00',2),
(96,1,5,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #30',2,'2006-01-22 00:00:00',5),
(97,2,7,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #33',2,'2006-01-22 00:00:00',7),
(98,2,4,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #36',2,'2006-01-22 00:00:00',4),
(99,1,3,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #38',2,'2006-01-22 00:00:00',3),
(100,2,9,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #39',2,'2006-01-22 00:00:00',9),
(101,1,2,'2006-01-14 00:00:00','2006-01-22 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #40',2,'2006-01-22 00:00:00',2),
(102,1,1,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #41',2,'2006-04-04 00:00:00',1),
(103,2,1,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #42',2,'2006-04-04 00:00:00',1),
(104,2,1,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #45',2,'2006-04-04 00:00:00',1),
(105,5,7,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,'CHECK','Purchase generated based on Order #46',2,'2006-04-04 00:00:00',7),
(106,6,7,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #46',2,'2006-04-04 00:00:00',7),
(107,1,6,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #47',2,'2006-04-04 00:00:00',6),
(108,2,4,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #48',2,'2006-04-04 00:00:00',4),
(109,2,4,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #48',2,'2006-04-04 00:00:00',4),
(110,1,3,'2006-03-24 00:00:00','2006-03-24 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #49',2,'2006-04-04 00:00:00',3),
(111,1,2,'2006-03-31 00:00:00','2006-03-31 00:00:00',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,'Purchase generated based on Order #56',2,'2006-04-04 00:00:00',2),
(140,6,NULL,'2006-04-25 00:00:00','2006-04-25 16:40:51',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-04-25 16:41:33',2),
(141,8,NULL,'2006-04-25 00:00:00','2006-04-25 17:10:35',2,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,2,'2006-04-25 17:10:55',2),
(142,8,NULL,'2006-04-25 00:00:00','2006-04-25 17:18:29',2,NULL,0.0000,0.0000,NULL,0.0000,'CHECK',NULL,2,'2006-04-25 17:18:51',2),
(146,2,2,'2006-04-26 18:26:37','2006-04-26 18:26:37',1,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,NULL,NULL,2),
(147,7,2,'2006-04-26 18:33:28','2006-04-26 18:33:28',1,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,NULL,NULL,2),
(148,5,2,'2006-04-26 18:33:52','2006-04-26 18:33:52',1,NULL,0.0000,0.0000,NULL,0.0000,NULL,NULL,NULL,NULL,2);

UNLOCK TABLES;
