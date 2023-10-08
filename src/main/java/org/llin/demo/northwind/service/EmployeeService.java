package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class EmployeeService<T extends _Entity>  {
	
	@Autowired
	private EmployeeRepository er;
		
	public List<T> getEmployees() {
		return  (List<T>) er.findAll();
	}

}
