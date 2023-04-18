
CREATE TRIGGER after_company_insert AFTER INSERT ON company 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'company', NOW());	