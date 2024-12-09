package org.llin.demo.northwind.data.repository.resource;

import org.llin.demo.northwind.data.config.PropertyDefaultConfig;
import org.llin.demo.northwind.data.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailResourceProcessor implements RepresentationModelProcessor<EntityModel<OrderDetail>> {

	@Autowired
	private PropertyDefaultConfig propertyDefaultConfig;

	@Override
	public EntityModel<OrderDetail> process(EntityModel<OrderDetail> model) {
		OrderDetail orderDetail = model.getContent();
		if (orderDetail != null) {
			Long customerOrderId = (long) orderDetail.getCustomerOrder().getId();
			model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/orderDetail/" + orderDetail.getId()
					+ "/customerOrder?id=" + customerOrderId, "customerOrder"));
			if (orderDetail.getInventoryTransaction() != null) {
				Long inventoryTransactionId = (long) orderDetail.getInventoryTransaction().getId();
				model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/orderDetail/" + orderDetail.getId()
						+ "/inventoryTransaction?id=" + inventoryTransactionId, "inventoryTransaction"));
			}
			if (orderDetail.getOrderStatus() != null) {
				Long orderStatus = (long) orderDetail.getOrderStatus().getId();
				model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/orderDetail/" + orderDetail.getId()
						+ "/orderStatus?id=" + orderStatus, "orderStatus"));
			}
			if (orderDetail.getProduct() != null) {
				Long productId = (long) orderDetail.getProduct().getId();
				model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/orderDetail/" + orderDetail.getId()
						+ "/product?id=" + productId, "product"));
			}
			if (orderDetail.getPurchaseOrder() != null) {
				Long purchaseOrderId = (long) orderDetail.getPurchaseOrder().getId();
				model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/orderDetail/" + orderDetail.getId()
						+ "/purchaseOrder?id=" + purchaseOrderId, "purchaseOrder"));
			}			
		}
		return model;
	}
}
