
CREATE TRIGGER after_customer_update AFTER UPDATE ON customer 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','customer',NOW());	           
	 