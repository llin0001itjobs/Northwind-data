package org.llin.demo.northwind.data.repository.resource;

import org.llin.demo.northwind.data.config.PropertyDefaultConfig;
import org.llin.demo.northwind.data.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductResourceProcessor implements RepresentationModelProcessor<EntityModel<Product>> {

	@Autowired
	private PropertyDefaultConfig propertyDefaultConfig;

	@Override
	public EntityModel<Product> process(EntityModel<Product> model) {
		Product product = model.getContent();
		if (product != null) {
			String supplierIds = product.generateSupplierIds();
			model.add(Link.of(
					propertyDefaultConfig.getApiUrl() + "/product/" + product.getId() + "/supplier?id=" + supplierIds,
					"supplier"));
		}
		return model;
	}
}
