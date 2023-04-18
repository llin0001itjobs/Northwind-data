package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.InventoryTransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="inventoryTransactionType")
public interface InventoryTransactionTypeRepository extends JpaRepository<InventoryTransactionType, Integer> {

}
