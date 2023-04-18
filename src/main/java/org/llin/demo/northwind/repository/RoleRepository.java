package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="role")
public interface RoleRepository extends JpaRepository<Role, String> {

	
}
