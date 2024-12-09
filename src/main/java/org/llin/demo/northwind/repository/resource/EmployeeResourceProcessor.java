package org.llin.demo.northwind.data.repository.resource;

import org.llin.demo.northwind.data.config.PropertyDefaultConfig;
import org.llin.demo.northwind.data.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class EmployeeResourceProcessor implements RepresentationModelProcessor<EntityModel<Employee>> {

	@Autowired
	private PropertyDefaultConfig propertyDefaultConfig;
	
    @Override
    public EntityModel<Employee> process(EntityModel<Employee> model) {
    	Employee employee = model.getContent();
        if (employee != null) {
            // Assuming you have a method getCompanyId() that returns the company ID
            Long companyId = (long) employee.getCompany().getId();
            model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/employee/" + employee.getId() + "/company?id=" + companyId, "company"));
            Long privilegeId = (long) employee.getPrivilege().getId();
            model.add(Link.of(propertyDefaultConfig.getApiUrl() + "/employee/" + employee.getId() + "/privilege?id=" + privilegeId, "privilege"));            
        }
        return model;
    }
}
