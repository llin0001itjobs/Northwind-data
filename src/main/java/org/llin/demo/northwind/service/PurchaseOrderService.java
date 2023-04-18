package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity.PurchaseOrder;
import org.llin.demo.northwind.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseOrderService {
	
	@Autowired
	private PurchaseOrderRepository purchaseOrdersRepository;
	
	@Transactional	  
	public List<PurchaseOrder> getAllPurchaseOrders() {
		return purchaseOrdersRepository.findAll();
	}
		
	@Transactional	  
	public PurchaseOrder getPurchaseOrdersById(int id) {
		return purchaseOrdersRepository.getById(id);	
	}
	
	@Transactional
	public long count() {		
		return purchaseOrdersRepository.count();
	}
	
}
