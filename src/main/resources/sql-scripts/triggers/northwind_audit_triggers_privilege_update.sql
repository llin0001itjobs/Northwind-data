
CREATE TRIGGER after_privilege_update AFTER UPDATE ON privilege 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','privilege',NOW());	           
	 