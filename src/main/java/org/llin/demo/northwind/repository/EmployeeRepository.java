package org.llin.demo.northwind.repository;


import org.llin.demo.northwind.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//List<Tutorial> findByTitleContaining(String title);
//http://localhost:8080/northwind-data/api/employees/search?
@RepositoryRestResource(path="employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
 