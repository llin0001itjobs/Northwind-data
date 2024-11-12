
CREATE TRIGGER after_product_supplier_update AFTER UPDATE ON product_supplier 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','product_supplier',NOW());	           
	 