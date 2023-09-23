package org.llin.demo.northwind.service;

import org.llin.demo.northwind.entity.Shipper;
import org.springframework.stereotype.Service;

@Service
public class ShipperService extends GenericService {

	public String getShippers() {
		return getEntity(Shipper.class.getSimpleName());
	}
}
