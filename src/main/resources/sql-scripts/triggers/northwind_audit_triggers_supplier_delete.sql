
CREATE TRIGGER after_supplier_delete AFTER DELETE ON supplier FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','supplier',NOW());
