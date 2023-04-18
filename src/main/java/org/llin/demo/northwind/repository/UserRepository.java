package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="user")
public interface UserRepository extends JpaRepository<User, Integer> {

}
