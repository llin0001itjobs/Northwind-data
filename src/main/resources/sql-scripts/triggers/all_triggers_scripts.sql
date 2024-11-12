-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: northwind
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table `audit_central`
--



DROP TABLE IF EXISTS `audit_central`;

CREATE TABLE `audit_central` (
  `id` int NOT NULL AUTO_INCREMENT,
  `action` varchar(64) NOT NULL,
  `table_name` varchar(64) NOT NULL,
  `date_created` datetime NOT NULL,  
  `date_updated` datetime NULL,  
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

--
-- Dumping data for table `user`
--

LOCK TABLES `audit_central` WRITE;

UNLOCK TABLES;

-- Dump completed on 2018-05-07 12:31:45


CREATE TRIGGER after_authentication_delete AFTER DELETE ON authentication 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','authentication',NOW());	           

CREATE TRIGGER after_authentication_insert AFTER INSERT ON authentication 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'authentication', NOW());	           

CREATE TRIGGER after_authentication_update AFTER UPDATE ON authentication 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','authentication',NOW());	           
	 
CREATE TRIGGER after_company_delete AFTER DELETE ON company FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','company',NOW());
				 	 
CREATE TRIGGER after_company_insert AFTER INSERT ON company 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'company', NOW());	
				 
CREATE TRIGGER after_company_update AFTER UPDATE ON company 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','company',NOW());	           
	 
CREATE TRIGGER after_customer_delete AFTER DELETE ON customer FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','customer',NOW());

CREATE TRIGGER after_customer_insert AFTER INSERT ON customer 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'customer', NOW());

CREATE TRIGGER after_customer_update AFTER UPDATE ON customer 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','customer',NOW());	

CREATE TRIGGER after_customer_order_delete AFTER DELETE ON customer_order FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','customer_order',NOW());

CREATE TRIGGER after_customer_order_insert AFTER INSERT ON customer_order 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'customer_order', NOW());

CREATE TRIGGER after_customer_order_update AFTER UPDATE ON customer_order 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','customer_order',NOW());	           
	 				 	 
CREATE TRIGGER after_employee_delete AFTER DELETE ON employee FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','employee',NOW());		 
				 
CREATE TRIGGER after_employee_insert AFTER INSERT ON employee 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'employee', NOW());	 

CREATE TRIGGER after_employee_update AFTER UPDATE ON employee 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','employee',NOW());	       


CREATE TRIGGER after_inventory_transaction_delete AFTER DELETE ON inventory_transaction FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','inventory_transaction',NOW());

CREATE TRIGGER after_inventory_transaction_insert AFTER INSERT ON inventory_transaction 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'inventory_transaction', NOW());

CREATE TRIGGER after_inventory_transaction_update AFTER UPDATE ON inventory_transaction 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','inventory_transaction',NOW());	   

CREATE TRIGGER after_invoice_delete AFTER DELETE ON invoice FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','invoice',NOW());

CREATE TRIGGER after_invoice_insert AFTER INSERT ON invoice 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'invoice', NOW());

CREATE TRIGGER after_invoice_update AFTER UPDATE ON invoice 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','invoice',NOW());

CREATE TRIGGER after_order_detail_delete AFTER DELETE ON order_detail FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','order_detail',NOW());

CREATE TRIGGER after_order_detail_insert AFTER INSERT ON order_detail 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'order_detail', NOW());

CREATE TRIGGER after_order_detail_update AFTER UPDATE ON order_detail 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','order_detail',NOW());	           
				
CREATE TRIGGER after_privilege_delete AFTER DELETE ON privilege FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','privilege',NOW());
				 
CREATE TRIGGER after_privilege_insert AFTER INSERT ON privilege 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'privilege', NOW());
	 
CREATE TRIGGER after_privilege_update AFTER UPDATE ON privilege 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','privilege',NOW());	 

CREATE TRIGGER after_product_delete AFTER DELETE ON product FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','product',NOW());

CREATE TRIGGER after_product_insert AFTER INSERT ON product 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'product', NOW());

CREATE TRIGGER after_product_update AFTER UPDATE ON product 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','product',NOW());	           
				
CREATE TRIGGER after_product_supplier_delete AFTER DELETE ON product_supplier FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','product_supplier',NOW());

CREATE TRIGGER after_product_supplier_insert AFTER INSERT ON product_supplier 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'product_supplier', NOW());

CREATE TRIGGER after_product_supplier_update AFTER UPDATE ON product_supplier 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','product_supplier',NOW());	

CREATE TRIGGER after_purchase_order_delete AFTER DELETE ON purchase_order FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','purchase_order',NOW());

CREATE TRIGGER after_purchase_order_insert AFTER INSERT ON purchase_order FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT','purchase_order',NOW());

CREATE TRIGGER after_purchase_order_update AFTER UPDATE ON purchase_order 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','purchase_order',NOW());	 

CREATE TRIGGER after_purchase_order_detail_delete AFTER DELETE ON purchase_order_detail FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','purchase_order_detail',NOW());

CREATE TRIGGER after_purchase_order_detail_insert AFTER INSERT ON purchase_order_detail 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'purchase_order_detail', NOW());
				 
CREATE TRIGGER after_purchase_order_detail_update AFTER UPDATE ON purchase_order_detail 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','purchase_order_detail',NOW());	
 				 	 				 
CREATE TRIGGER after_shipper_delete AFTER DELETE ON shipper FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','shipper',NOW());
				  
CREATE TRIGGER after_shipper_insert AFTER INSERT ON shipper
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'shipper', NOW());	   
				 
CREATE TRIGGER after_shipper_update AFTER UPDATE ON shipper 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','shipper',NOW());	           
				
CREATE TRIGGER after_supplier_delete AFTER DELETE ON supplier FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','supplier',NOW());

CREATE TRIGGER after_supplier_insert AFTER INSERT ON supplier 
  FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'supplier', NOW());	           

CREATE TRIGGER after_supplier_update AFTER UPDATE ON supplier 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','supplier',NOW());	           
	 
	 
				
	 
	 
	 
	 				 
	 				 
	 				 