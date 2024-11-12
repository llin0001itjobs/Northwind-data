
CREATE TRIGGER after_order_detail_update AFTER UPDATE ON order_detail 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,date_updated)
                VALUES (NEW.id,'UPDATE','order_detail',NOW());	           
	 