
CREATE TRIGGER after_company_update AFTER UPDATE ON company 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_created)
                VALUES (NEW.id,'UPDATE','company',NOW());	           
	 