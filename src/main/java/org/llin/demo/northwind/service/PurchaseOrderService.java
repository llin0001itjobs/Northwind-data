package org.llin.demo.northwind.service;

import org.llin.demo.northwind.entity.PurchaseOrder;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService extends GenericService {

	public String getPurchaseOrders() {
		return getEntity(PurchaseOrder.class.getSimpleName());
	}
}
