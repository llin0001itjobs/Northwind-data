package org.llin.demo.northwind.service;

import org.llin.demo.northwind.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends GenericService {
	
	public String getEmployees() {
		return getEntity(Employee.class.getSimpleName());
	}
	
}

