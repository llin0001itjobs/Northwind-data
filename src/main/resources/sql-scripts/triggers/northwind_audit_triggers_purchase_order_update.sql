
CREATE TRIGGER after_purchase_order_update AFTER UPDATE ON purchase_order 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','purchase_order',NOW());	           
	 