package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class CustomerOrderService<T extends _Entity>  {
	
	@Autowired
	private CustomerOrderRepository cor;
		
	public List<T> getCustomerOrders() {
		return  (List<T>) cor.findAll();
	}

	
}
