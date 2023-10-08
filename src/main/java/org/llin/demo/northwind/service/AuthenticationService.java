package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class AuthenticationService<T extends _Entity>  {
	
	@Autowired
	private AuthenticationRepository ar;
		
	public List<T> getAuthentications() {
		return  (List<T>) ar.findAll();
	}

}
