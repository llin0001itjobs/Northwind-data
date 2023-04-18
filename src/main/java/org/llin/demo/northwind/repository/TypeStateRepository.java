package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.TypeState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "typeState")
public interface TypeStateRepository extends JpaRepository<TypeState, String> {

}
