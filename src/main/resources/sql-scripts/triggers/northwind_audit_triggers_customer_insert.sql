
CREATE TRIGGER after_customer_insert AFTER INSERT ON customer 
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (NEW.id,'INSERT', 'customer', NOW());