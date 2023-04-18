package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.PurchaseOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="purchaseOrderStatus")  
public interface PurchaseOrderStatusRepository extends JpaRepository<PurchaseOrderStatus, Integer> {

}
