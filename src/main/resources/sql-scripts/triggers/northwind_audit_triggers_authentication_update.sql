
CREATE TRIGGER after_authentication_update AFTER UPDATE ON authentication 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','authentication',NOW());	           
	 


	 
