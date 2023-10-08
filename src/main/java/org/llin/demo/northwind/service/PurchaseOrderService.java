package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class PurchaseOrderService<T extends _Entity>  {
	
	@Autowired
	private PurchaseOrderRepository por;
		
	public List<T> getPurchaseOrders() {
		return  (List<T>) por.findAll();
	}

}
