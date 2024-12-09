package org.llin.demo.northwind.data.repository;

import org.llin.demo.northwind.data.entity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="authentication")
public interface AuthenticationRepository extends JpaRepository<Authentication, Integer> {


}
