
CREATE TRIGGER after_employee_update AFTER UPDATE ON employee 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,creation_date)
                VALUES (NEW.id,'UPDATE','employee',NOW());	           
	 