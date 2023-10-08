package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customerOrder")
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {




}
