
CREATE TRIGGER after_employee_update AFTER UPDATE ON employee 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','employee',NOW());	           
	 