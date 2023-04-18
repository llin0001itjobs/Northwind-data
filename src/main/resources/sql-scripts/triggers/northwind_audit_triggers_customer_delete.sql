
CREATE TRIGGER after_customer_delete AFTER DELETE ON customer FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (OLD.id,'DELETE','customer',NOW());