
CREATE TRIGGER after_purchase_order_detail_delete AFTER DELETE ON purchase_order_detail FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','purchase_order_detail',NOW());