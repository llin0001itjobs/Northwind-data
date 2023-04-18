
CREATE TRIGGER after_privilege_delete AFTER DELETE ON privilege FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','privilege',NOW());