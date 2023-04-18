
CREATE TRIGGER after_invoice_insert AFTER INSERT ON invoice 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'invoice', NOW());