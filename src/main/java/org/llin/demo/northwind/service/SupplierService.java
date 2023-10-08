package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class SupplierService<T extends _Entity>  {
	
	@Autowired
	private SupplierRepository sur;
		
	public List<T> getSuppliers() {
		return  (List<T>) sur.findAll();
	}

}
