
CREATE TRIGGER after_customer_insert AFTER INSERT ON customer 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'customer', NOW());