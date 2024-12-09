package org.llin.demo.northwind.data.repository.resource;

import org.llin.demo.northwind.data.config.PropertyDefaultConfig;
import org.llin.demo.northwind.data.entity.Shipper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ShipperResourceProcessor implements RepresentationModelProcessor<EntityModel<Shipper>> {

	@Autowired
	private PropertyDefaultConfig propertyDefaultConfig;
	
    @Override
    public EntityModel<Shipper> process(EntityModel<Shipper> model) {
        Shipper shipper = model.getContent();
        if (shipper != null) {
            // Assuming you have a method getCompanyId() that returns the company ID
            Long companyId = (long) shipper.getCompany().getId();
            model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/shipper/" + shipper.getId() + "/company?id=" + companyId, "company"));
        }
        return model;
    }
}
