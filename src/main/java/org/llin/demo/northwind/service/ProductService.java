package org.llin.demo.northwind.service;

import java.util.List;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unchecked")
@Service
public class ProductService<T extends _Entity>  {
	
	@Autowired
	private ProductRepository pr;
		
	public List<T> getProducts() {
		return  (List<T>) pr.findAll();
	}

}
