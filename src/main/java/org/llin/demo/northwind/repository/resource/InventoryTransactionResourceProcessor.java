package org.llin.demo.northwind.data.repository.resource;

import org.llin.demo.northwind.data.config.PropertyDefaultConfig;
import org.llin.demo.northwind.data.entity.InventoryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class InventoryTransactionResourceProcessor
		implements RepresentationModelProcessor<EntityModel<InventoryTransaction>> {

	@Autowired
	private PropertyDefaultConfig propertyDefaultConfig;

	@Override
	public EntityModel<InventoryTransaction> process(EntityModel<InventoryTransaction> model) {
		InventoryTransaction inventoryTransaction = model.getContent();
		if (inventoryTransaction != null) {
			Long productId = (long) inventoryTransaction.getProduct().getId();
			model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/inventoryTransaction/"
					+ inventoryTransaction.getId() + "/product?id=" + productId, "product"));
			Long transactionType = (long) inventoryTransaction.getInventoryTransactionType().getId();
			model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/inventoryTransaction/"
					+ inventoryTransaction.getId() + "/transactionType?id=" + transactionType, "transactionType"));

			if (inventoryTransaction.getCustomerOrder() != null) {
				Long customerOrderId = (long) inventoryTransaction.getCustomerOrder().getId();
				model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/inventoryTransaction/"
						+ inventoryTransaction.getId() + "/customerOrder?id=" + customerOrderId, "customerOrder"));
			}
			if (inventoryTransaction.getPurchaseOrder() != null) {
				Long purchaseOrderId = (long) inventoryTransaction.getPurchaseOrder().getId();
				model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/inventoryTransaction/"
						+ inventoryTransaction.getId() + "/purchaseOrder?id=" + purchaseOrderId, "purchaseOrder"));
			}
		}
		return model;
	}
}
