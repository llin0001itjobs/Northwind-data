package org.llin.demo.northwind.service;

import org.llin.demo.northwind.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductsService {
	
	@Autowired
	private ProductRepository productsRepository;
	
    @Transactional
	public long count() {		
		return productsRepository.count();
	}
	
}
