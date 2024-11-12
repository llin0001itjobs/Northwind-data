
CREATE TRIGGER after_inventory_transaction_delete AFTER DELETE ON inventory_transaction FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,date_created)
                 VALUES (OLD.id,'DELETE','inventory_transaction',NOW());