package org.llin.demo.northwind.service;

import org.llin.demo.northwind.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomersService {
	
	@Autowired
	private CustomerRepository customersRepository;
		
	@Transactional
	public long count() {		
		return customersRepository.count();
	}
	
}
