package org.llin.demo.northwind.service;

import org.llin.demo.northwind.entity.Supplier;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends GenericService {

	public String getSuppliers() {
		return getEntity(Supplier.class.getSimpleName());
	}
}
