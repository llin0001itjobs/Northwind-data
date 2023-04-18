package org.llin.demo.northwind.service;

import org.llin.demo.northwind.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeesService {
	
	@Autowired
	private EmployeeRepository employeesRepository;
	
	@Transactional
	public long count() {		
		return employeesRepository.count();
	}
	
}
