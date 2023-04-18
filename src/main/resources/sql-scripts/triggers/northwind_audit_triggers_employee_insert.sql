
CREATE TRIGGER after_employee_insert AFTER INSERT ON employee 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'employee', NOW());