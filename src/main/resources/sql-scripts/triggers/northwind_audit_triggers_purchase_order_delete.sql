
CREATE TRIGGER after_purchase_order_delete AFTER DELETE ON purchase_order FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','purchase_order',NOW());