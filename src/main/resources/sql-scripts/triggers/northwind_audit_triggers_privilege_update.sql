
CREATE TRIGGER after_privilege_update AFTER UPDATE ON privilege 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,creation_date)
                VALUES (NEW.id,'UPDATE','privilege',NOW());	           
	 