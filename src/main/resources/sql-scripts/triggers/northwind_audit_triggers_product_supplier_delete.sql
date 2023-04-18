
CREATE TRIGGER after_product_supplier_delete AFTER DELETE ON product_supplier FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','product_supplier',NOW());