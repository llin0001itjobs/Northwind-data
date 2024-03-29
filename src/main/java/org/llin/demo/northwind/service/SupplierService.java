package org.llin.demo.northwind.service;

import java.util.List;
import java.util.Optional;

import org.llin.demo.northwind.entity.Supplier;
import org.llin.demo.northwind.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService  {
	
	@Autowired
	private SupplierRepository sur;
		
	public List<Supplier> getSuppliers() {
		return  (List<Supplier>) sur.findAll();
	}

	public Optional<Supplier> getSupplier(Integer id) {
		return  sur.findById(id);
	}

	public long getCount() {
		return  sur.count();
	}
}
