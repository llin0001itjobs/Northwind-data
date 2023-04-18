
CREATE TRIGGER after_purchase_order_detail_insert AFTER INSERT ON purchase_order_detail 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'purchase_order_detail', NOW());