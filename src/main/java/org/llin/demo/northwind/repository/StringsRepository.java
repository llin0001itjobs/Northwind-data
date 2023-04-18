package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.Strings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="strings")
public interface StringsRepository extends JpaRepository<Strings, Integer> {

}
