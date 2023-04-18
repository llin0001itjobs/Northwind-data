
CREATE TRIGGER after_product_insert AFTER INSERT ON product 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'product', NOW());