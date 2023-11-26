package org.llin.demo.northwind.service;

import java.util.List;
import java.util.Optional;

import org.llin.demo.northwind.entity.Authentication;
import org.llin.demo.northwind.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService  {
	
	@Autowired
	private AuthenticationRepository ar;
		
	public List<Authentication> getAuthentications() {
		return  ar.findAll();
	}

	public Optional<Authentication> getAuthentication(Integer id) {
		return  ar.findById(id);
	}

	public long getCount() {
		return  ar.count();
	} 
}
