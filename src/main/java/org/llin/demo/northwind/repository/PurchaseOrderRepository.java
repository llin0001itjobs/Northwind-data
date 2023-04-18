package org.llin.demo.northwind.repository;

import java.time.LocalDateTime;

import org.llin.demo.northwind.entity.PurchaseOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "purchaseOrder")
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {



}
