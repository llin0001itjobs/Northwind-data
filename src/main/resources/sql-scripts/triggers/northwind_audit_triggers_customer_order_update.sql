
CREATE TRIGGER after_customer_order_update AFTER UPDATE ON customer_order 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','customer_order',NOW());	           
	 