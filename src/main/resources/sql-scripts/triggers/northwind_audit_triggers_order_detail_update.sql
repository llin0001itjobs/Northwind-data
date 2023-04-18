
CREATE TRIGGER after_order_detail_update AFTER UPDATE ON order_detail 
FOR EACH ROW
 INSERT INTO audit_central (id,action,table_name,creation_date)
                VALUES (NEW.id,'UPDATE','order_detail',NOW());	           
	 