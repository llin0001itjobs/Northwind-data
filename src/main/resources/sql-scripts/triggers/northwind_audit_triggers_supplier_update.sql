
CREATE TRIGGER after_supplier_update AFTER UPDATE ON supplier 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','supplier',NOW());	           
	 