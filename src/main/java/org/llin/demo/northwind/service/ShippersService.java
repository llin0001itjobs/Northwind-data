package org.llin.demo.northwind.service;

import org.llin.demo.northwind.repository.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShippersService {
	
	@Autowired
	private ShipperRepository shippersRepository;
	
	@Transactional
	public long count() {		
		return shippersRepository.count();
	}
	
}
