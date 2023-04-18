
CREATE TRIGGER after_order_detail_delete AFTER DELETE ON order_detail FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','order_detail',NOW());