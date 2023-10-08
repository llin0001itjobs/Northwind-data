package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class ShipperService<T extends _Entity>  {
	
	@Autowired
	private ShipperRepository shr;
		
	public List<T> getShippers() {
		return  (List<T>) shr.findAll();
	}

}
