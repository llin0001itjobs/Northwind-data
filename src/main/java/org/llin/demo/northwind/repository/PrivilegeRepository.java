package org.llin.demo.northwind.data.repository;

import org.llin.demo.northwind.data.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="privilege")
public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
	
}
