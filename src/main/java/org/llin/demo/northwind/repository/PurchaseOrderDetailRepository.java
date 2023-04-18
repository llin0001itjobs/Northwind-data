package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.PurchaseOrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="purchaseOrderDetail")
public interface PurchaseOrderDetailRepository extends JpaRepository<PurchaseOrderDetail, Integer> {
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
