-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table product
--

DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id int NOT NULL AUTO_INCREMENT,
  product_code varchar(32) NOT NULL,
  product_name varchar(64) DEFAULT NULL,
  description longtext,
  standard_cost decimal(19,4) DEFAULT '0.0000',
  list_price decimal(19,4) DEFAULT '0.0000',
  reorder_level int(11) DEFAULT NULL,
  target_level int(11) DEFAULT NULL,
  quantity_per_unit varchar(64) DEFAULT NULL,
  discontinued tinyint(1) DEFAULT '0',
  minimum_reorder_quantity int(11) DEFAULT NULL,
  category varchar(64) DEFAULT NULL,
  resource_id int(11) DEFAULT '0',
  PRIMARY KEY (id),
  KEY product_code (product_code)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=UTF8MB4;


--
-- Dumping data for table product
--

LOCK TABLES product WRITE;

INSERT INTO product VALUES (1,'NWTB-1','Northwind Traders Chai',NULL,13.5000,18.0000,10,40,'10 boxes x 20 bags',0,10,'Beverages',0),
(3,'NWTCO-3','Northwind Traders Syrup',NULL,7.5000,10.0000,25,100,'12 - 550 ml bottles',0,25,'Condiments',0),
(4,'NWTCO-4','Northwind Traders Cajun Seasoning',NULL,16.5000,22.0000,10,40,'48 - 6 oz jars',0,10,'Condiments',0),
(5,'NWTO-5','Northwind Traders Olive Oil',NULL,16.0125,21.3500,10,40,'36 boxes',0,10,'Oil',0),
(6,'NWTJP-6','Northwind Traders Boysenberry Spread',NULL,18.7500,25.0000,25,100,'12 - 8 oz jars',0,25,'Jams, Preserves',0),
(7,'NWTDFN-7','Northwind Traders Dried Pears',NULL,22.5000,30.0000,10,40,'12 - 1 lb pkgs.',0,10,'Dried Fruit & Nuts',0),
(8,'NWTS-8','Northwind Traders Curry Sauce',NULL,30.0000,40.0000,10,40,'12 - 12 oz jars',0,10,'Sauces',0),
(14,'NWTDFN-14','Northwind Traders Walnuts',NULL,17.4375,23.2500,10,40,'40 - 100 g pkgs.',0,10,'Dried Fruit & Nuts',0),
(17,'NWTCFV-17','Northwind Traders Fruit Cocktail',NULL,29.2500,39.0000,10,40,'15.25 OZ',0,10,'Canned Fruit & Vegetables',0),
(19,'NWTBGM-19','Northwind Traders Chocolate Biscuits Mix',NULL,6.9000,9.2000,5,20,'10 boxes x 12 pieces',0,5,'Baked Goods & Mixes',0),
(20,'NWTJP-6','Northwind Traders Marmalade',NULL,60.7500,81.0000,10,40,'30 gift boxes',0,10,'Jams, Preserves',0),
(21,'NWTBGM-21','Northwind Traders Scones',NULL,7.5000,10.0000,5,20,'24 pkgs. x 4 pieces',0,5,'Baked Goods & Mixes',0),
(34,'NWTB-34','Northwind Traders Beer',NULL,10.5000,14.0000,15,60,'24 - 12 oz bottles',0,15,'Beverages',0),
(40,'NWTCM-40','Northwind Traders Crab Meat',NULL,13.8000,18.4000,30,120,'24 - 4 oz tins',0,30,'Canned Meat',0),
(41,'NWTSO-41','Northwind Traders Clam Chowder',NULL,7.2375,9.6500,10,40,'12 - 12 oz cans',0,10,'Soups',0),
(43,'NWTB-43','Northwind Traders Coffee',NULL,34.5000,46.0000,25,100,'16 - 500 g tins',0,25,'Beverages',0),
(48,'NWTCA-48','Northwind Traders Chocolate',NULL,9.5625,12.7500,25,100,'10 pkgs',0,25,'Candy',0),
(51,'NWTDFN-51','Northwind Traders Dried Apples',NULL,39.7500,53.0000,10,40,'50 - 300 g pkgs.',0,10,'Dried Fruit & Nuts',0),
(52,'NWTG-52','Northwind Traders Long Grain Rice',NULL,5.2500,7.0000,25,100,'16 - 2 kg boxes',0,25,'Grains',0),
(56,'NWTP-56','Northwind Traders Gnocchi',NULL,28.5000,38.0000,30,120,'24 - 250 g pkgs.',0,30,'Pasta',0),
(57,'NWTP-57','Northwind Traders Ravioli',NULL,14.6250,19.5000,20,80,'24 - 250 g pkgs.',0,20,'Pasta',0),
(65,'NWTS-65','Northwind Traders Hot Pepper Sauce',NULL,15.7875,21.0500,10,40,'32 - 8 oz bottles',0,10,'Sauces',0),
(66,'NWTS-66','Northwind Traders Tomato Sauce',NULL,12.7500,17.0000,20,80,'24 - 8 oz jars',0,20,'Sauces',0),
(72,'NWTD-72','Northwind Traders Mozzarella',NULL,26.1000,34.8000,10,40,'24 - 200 g pkgs.',0,10,'Dairy product',0),
(74,'NWTDFN-74','Northwind Traders Almonds',NULL,7.5000,10.0000,5,20,'5 kg pkg.',0,5,'Dried Fruit & Nuts',0),
(77,'NWTCO-77','Northwind Traders Mustard',NULL,9.7500,13.0000,15,60,'12 boxes',0,15,'Condiments',0),
(80,'NWTDFN-80','Northwind Traders Dried Plums',NULL,3.0000,3.5000,50,75,'1 lb bag',0,25,'Dried Fruit & Nuts',0),
(81,'NWTB-81','Northwind Traders Green Tea',NULL,2.0000,2.9900,100,125,'20 bags per box',0,25,'Beverages',0),
(82,'NWTC-82','Northwind Traders Granola',NULL,2.0000,4.0000,20,100,NULL,0,NULL,'Cereal',0),
(83,'NWTCS-83','Northwind Traders Potato Chips',NULL,0.5000,1.8000,30,200,NULL,0,NULL,'Chips, Snacks',0),
(85,'NWTBGM-85','Northwind Traders Brownie Mix',NULL,9.0000,12.4900,10,20,'3 boxes',0,5,'Baked Goods & Mixes',0),
(86,'NWTBGM-86','Northwind Traders Cake Mix',NULL,10.5000,15.9900,10,20,'4 boxes',0,5,'Baked Goods & Mixes',0),
(87,'NWTB-87','Northwind Traders Tea',NULL,2.0000,4.0000,20,50,'100 count per box',0,NULL,'Beverages',0),
(88,'NWTCFV-88','Northwind Traders Pears',NULL,1.0000,1.3000,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables',0),
(89,'NWTCFV-89','Northwind Traders Peaches',NULL,1.0000,1.5000,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables',0),
(90,'NWTCFV-90','Northwind Traders Pineapple',NULL,1.0000,1.8000,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables',0),
(91,'NWTCFV-91','Northwind Traders Cherry Pie Filling',NULL,1.0000,2.0000,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables',0),
(92,'NWTCFV-92','Northwind Traders Green Beans',NULL,1.0000,1.2000,10,40,'14.5 OZ',0,NULL,'Canned Fruit & Vegetables',0),
(93,'NWTCFV-93','Northwind Traders Corn',NULL,1.0000,1.2000,10,40,'14.5 OZ',0,NULL,'Canned Fruit & Vegetables',0),
(94,'NWTCFV-94','Northwind Traders Peas',NULL,1.0000,1.5000,10,40,'14.5 OZ',0,NULL,'Canned Fruit & Vegetables',0),
(95,'NWTCM-95','Northwind Traders Tuna Fish',NULL,0.5000,2.0000,30,50,'5 oz',0,NULL,'Canned Meat',0),
(96,'NWTCM-96','Northwind Traders Smoked Salmon',NULL,2.0000,4.0000,30,50,'5 oz',0,NULL,'Canned Meat',0),
(97,'NWTC-82','Northwind Traders Hot Cereal',NULL,3.0000,5.0000,50,200,NULL,0,NULL,'Cereal',0),
(98,'NWTSO-98','Northwind Traders Vegetable Soup',NULL,1.0000,1.8900,100,200,NULL,0,NULL,'Soups',0),
(99,'NWTSO-99','Northwind Traders Chicken Soup',NULL,1.0000,1.9500,100,200,NULL,0,NULL,'Soups',0);

UNLOCK TABLES;
