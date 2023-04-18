package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="orderStatus") 
public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {

}
