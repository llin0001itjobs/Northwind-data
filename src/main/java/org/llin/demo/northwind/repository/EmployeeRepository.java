package org.llin.demo.northwind.repository;


import org.llin.demo.northwind.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//List<Tutorial> findByTitleContaining(String title);
//http://localhost:8080/northwind-data/api/employees/search?
@RepositoryRestResource(path="employee")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	Page<Employee> findByLastNameOrderByFirstNameAsc(String lastName, Pageable pageable);
	Page<Employee> findByLastNameOrderByFirstNameDesc(String lastName, Pageable pageable);

	Page<Employee> findByStateProvinceOrderByLastNameAsc(String stateProvince, Pageable pageable);
	Page<Employee> findByStateProvinceOrderByLastNameDesc(String stateProvince, Pageable pageable);
	
	Page<Employee> findByZipPostalCodeOrderByLastNameAsc(String zipPostalCode, Pageable pageable);
	Page<Employee> findByZipPostalCodeOrderByLastNameDesc(String zipPostalCode, Pageable pageable);
}
 