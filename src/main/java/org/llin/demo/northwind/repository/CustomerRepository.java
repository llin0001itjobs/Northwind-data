package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="customer")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
				
	Page<Customer> findByJobTitleOrderByLastNameAsc(String jobTitle, Pageable pageable);
	Page<Customer> findByJobTitleOrderByLastNameDesc(String jobTitle, Pageable pageable);
		
	Page<Customer> findByLastNameOrderByFirstNameAsc(String lastName, Pageable pageable);
	Page<Customer> findByLastNameOrderByFirstNameDesc(String lastName, Pageable pageable);
	
	Page<Customer> findByStateProvinceOrderByLastNameAsc(String stateProvince, Pageable pageable);
	Page<Customer> findByStateProvinceOrderByLastNameDesc(String stateProvince, Pageable pageable);

	Page<Customer> findByZipPostalCodeOrderByLastNameAsc(String zipPostalCode, Pageable pageable);
	Page<Customer> findByZipPostalCodeOrderByLastNameDesc(String zipPostalCode, Pageable pageable);	
}
