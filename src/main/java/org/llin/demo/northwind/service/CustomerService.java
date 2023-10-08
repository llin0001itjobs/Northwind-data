package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class CustomerService<T extends _Entity>  {
	
	@Autowired
	private CustomerRepository cr;
		
	public List<T> getCustomers() {
		return  (List<T>) cr.findAll();
	}

	
}
