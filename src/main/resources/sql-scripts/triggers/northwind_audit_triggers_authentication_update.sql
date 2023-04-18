
CREATE TRIGGER after_authentication_update AFTER UPDATE ON authentication 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,creation_date)
                VALUES (NEW.id,'UPDATE','authentication',NOW());	           
	 


	 
