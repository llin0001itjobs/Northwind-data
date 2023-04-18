 

CREATE TRIGGER after_shipper_insert AFTER INSERT ON shipper
FOR EACH ROW
  INSERT INTO audit_central (id,action,table_name,creation_date)
                 VALUES (NEW.id,'INSERT', 'shipper', NOW());	   
				 
