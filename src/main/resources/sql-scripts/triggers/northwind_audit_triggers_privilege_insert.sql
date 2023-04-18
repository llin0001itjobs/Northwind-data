
CREATE TRIGGER after_privilege_insert AFTER INSERT ON privilege 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'privilege', NOW());