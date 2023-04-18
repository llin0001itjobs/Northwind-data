
CREATE TRIGGER after_authentication_delete AFTER DELETE ON authentication 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','authentication',NOW());	           
	 
