
CREATE TRIGGER after_authentication_insert AFTER INSERT ON authentication 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'authentication', NOW());	           

