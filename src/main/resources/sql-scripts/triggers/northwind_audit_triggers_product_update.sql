
CREATE TRIGGER after_product_update AFTER UPDATE ON product 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','product',NOW());	           
	 