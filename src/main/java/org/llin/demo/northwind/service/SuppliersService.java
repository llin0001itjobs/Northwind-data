package org.llin.demo.northwind.service;

import org.llin.demo.northwind.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SuppliersService {
	
	@Autowired
	private SupplierRepository suppliersRepository;
		
	@Transactional
	public long count() {		
		return suppliersRepository.count();
	}
	
}
