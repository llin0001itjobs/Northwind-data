
CREATE TRIGGER after_invoice_update AFTER UPDATE ON invoice 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','invoice',NOW());	           
	 