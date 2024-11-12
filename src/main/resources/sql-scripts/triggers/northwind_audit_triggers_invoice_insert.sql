
CREATE TRIGGER after_invoice_insert AFTER INSERT ON invoice 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'invoice', NOW());