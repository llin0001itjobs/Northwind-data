
CREATE TRIGGER after_shipper_update AFTER UPDATE ON shipper 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','shipper',NOW());	           
	 