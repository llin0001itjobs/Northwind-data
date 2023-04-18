
CREATE TRIGGER after_supplier_insert AFTER INSERT ON supplier 
  FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'supplier', NOW());	           

