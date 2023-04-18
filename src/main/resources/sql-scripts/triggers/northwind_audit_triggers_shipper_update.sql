
CREATE TRIGGER after_shipper_update AFTER UPDATE ON shipper 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,creation_date)
                VALUES (NEW.id,'UPDATE','shipper',NOW());	           
	 