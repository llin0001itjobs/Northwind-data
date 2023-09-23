package org.llin.demo.northwind.service;

import org.llin.demo.northwind.entity.Customer;
import org.springframework.stereotype.Service;

@SuppressWarnings("rawtypes")
@Service
public class CustomerService extends GenericService {
	
	public String getCustomers() {
		return getEntity(Customer.class.getSimpleName()); 
	}
	
}
