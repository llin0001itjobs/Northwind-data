package org.llin.demo.northwind.service;

import java.util.List;
import java.util.Optional;

import org.llin.demo.northwind.entity.Product;
import org.llin.demo.northwind.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pr;

	public List<Product> getProducts() {
		return (List<Product>) pr.findAll();
	}

	public Optional<Product> getProduct(Integer id) {
		return pr.findById(id);
	}

	public long getCount() {
		return pr.count();
	}
}
