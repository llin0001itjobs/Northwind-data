
CREATE TRIGGER after_company_delete AFTER DELETE ON company FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','company',NOW());