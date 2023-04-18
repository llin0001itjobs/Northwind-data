package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.SalesReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="salesReport")
public interface SalesReportRepository extends JpaRepository<SalesReport, String> {

}
