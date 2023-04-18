
CREATE TRIGGER after_invoice_delete AFTER DELETE ON invoice FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','invoice',NOW());