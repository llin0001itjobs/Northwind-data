
CREATE TRIGGER after_order_detail_insert AFTER INSERT ON order_detail 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'order_detail', NOW());