package org.llin.demo.northwind.service;

import org.llin.demo.northwind.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends GenericService {
	
	public String getProducts() {
		return getEntity(Product.class.getSimpleName());
	}
	
	
}
