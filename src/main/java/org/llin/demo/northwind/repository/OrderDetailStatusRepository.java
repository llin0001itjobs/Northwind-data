package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.OrderDetailStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="orderDetailStatus")
public interface OrderDetailStatusRepository extends JpaRepository<OrderDetailStatus, Integer> {

}
