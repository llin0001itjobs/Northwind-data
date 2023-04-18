package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.OrderTaxStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="orderTaxStatus")
public interface OrderTaxStatusRepository extends JpaRepository<OrderTaxStatus, Integer> {

}
