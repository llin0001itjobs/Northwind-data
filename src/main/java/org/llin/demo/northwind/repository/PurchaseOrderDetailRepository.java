package org.llin.demo.northwind.data.repository;

import java.util.List;

import org.llin.demo.northwind.data.entity.PurchaseOrderDetail;
import org.llin.demo.northwind.data.repository.model.LabelDoubleValueLong;
import org.llin.demo.northwind.data.repository.model.LabelValueLong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="purchaseOrderDetail")
public interface PurchaseOrderDetailRepository extends JpaRepository<PurchaseOrderDetail, Integer> {
		
	@Query("SELECT NEW org.llin.demo.northwind.data.repository.model.LabelValueLong"
			+ "    (CASE "
			+ "        WHEN unit_cost < 13 THEN '0 - 12.99'"
			+ "        WHEN unit_cost < 26 THEN '13 - 25.99'"
			+ "        WHEN unit_cost < 39 THEN '26 - 38.99'"
			+ "        WHEN unit_cost < 52 THEN '39 - 51.99'"
			+ "        ELSE '52 and above'"
			+ "    END AS label,"
			+ "    SUM(quantity) AS value)"
			+ " FROM "
			+ "    PurchaseOrderDetail p"
			+ " GROUP BY "
			+ "    CASE "
			+ "        WHEN unit_cost < 13 THEN '0 - 12.99'"
			+ "        WHEN unit_cost < 26 THEN '13 - 25.99'"
			+ "        WHEN unit_cost < 39 THEN '26 - 38.99'"
			+ "        WHEN unit_cost < 52 THEN '39 - 51.99'"
			+ "        ELSE '52 and above'"
			+ "    END"
			+ " ORDER BY "
			+ "    label")
	List<LabelValueLong> quantityPerCostRange();
	
	@Query("SELECT NEW org.llin.demo.northwind.data.repository.model.LabelDoubleValueLong"
			+ "    (p.unitCost AS label, "
			+ "    SUM(quantity) AS value)"
			+ " FROM "
			+ "    PurchaseOrderDetail p"
			+ " GROUP BY "
			+ "    unit_cost"
			+ " ORDER BY "
			+ "    unit_cost")   
	List<LabelDoubleValueLong> quantityPerUnitCost();
			
	Page<PurchaseOrderDetail> findByQuantityOrderByQuantityAsc(double quantity, Pageable pageable);
	Page<PurchaseOrderDetail> findByQuantityOrderByQuantityDesc(double quantity, Pageable pageable);
	
	Page<PurchaseOrderDetail> findByQuantityGreaterThanEqualOrderByQuantityAsc(double quantity, Pageable pageable);
	Page<PurchaseOrderDetail> findByQuantityGreaterThanEqualOrderByQuantityDesc(double quantity, Pageable pageable);
	
	Page<PurchaseOrderDetail> findByQuantityLessThanEqualOrderByQuantityAsc(double quantity, Pageable pageable);
	Page<PurchaseOrderDetail> findByQuantityLessThanEqualOrderByQuantityDesc(double quantity, Pageable pageable);	
	
	Page<PurchaseOrderDetail> findByUnitCostOrderByUnitCostAsc(double unitCost, Pageable pageable);
	Page<PurchaseOrderDetail> findByUnitCostOrderByUnitCostDesc(double unitCost, Pageable pageable);

	Page<PurchaseOrderDetail> findByUnitCostGreaterThanEqualOrderByQuantityAsc(double unitCost, Pageable pageable);
	Page<PurchaseOrderDetail> findByUnitCostGreaterThanEqualOrderByQuantityDesc(double unitCost, Pageable pageable);
	
	Page<PurchaseOrderDetail> findByUnitCostLessThanEqualOrderByQuantityAsc(double unitCost, Pageable pageable);
	Page<PurchaseOrderDetail> findByUnitCostLessThanEqualOrderByQuantityDesc(double unitCost, Pageable pageable);	
		
}
