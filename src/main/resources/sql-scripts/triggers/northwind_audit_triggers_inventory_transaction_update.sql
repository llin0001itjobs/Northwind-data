
CREATE TRIGGER after_inventory_transaction_update AFTER UPDATE ON inventory_transaction 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','inventory_transaction',NOW());	           
	 