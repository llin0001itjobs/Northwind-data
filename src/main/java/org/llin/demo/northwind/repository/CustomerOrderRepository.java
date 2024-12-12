package org.llin.demo.northwind.data.repository;

import java.util.List;

import org.llin.demo.northwind.data.entity.CustomerOrder;
import org.llin.demo.northwind.data.repository.model.FeeRangePerCount;
import org.llin.demo.northwind.data.repository.model.ShippingFeePerMonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestResource(path = "customerOrder")
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	@Query("SELECT NEW org.llin.demo.northwind.data.repository.model.ShippingFeePerMonth"
			+ "    (EXTRACT(MONTH FROM c.shippedDate) AS month,"
			+ "    SUM(c.shippingFee) AS totalShippingFee)"
			+ " FROM "
			+ "    CustomerOrder c"
			+ " WHERE "
			+ "    c.shippedDate IS NOT NULL"
			+ " GROUP BY "
			+ "    EXTRACT(MONTH FROM c.shippedDate)"
			+ " ORDER BY "
			+ "    month")
	@RequestMapping("/shippingFeePerMonth")  	
	List<ShippingFeePerMonth> shippingFeePerMonth();
	
	@Query("SELECT NEW org.llin.demo.northwind.data.repository.model.FeeRangePerCount"
			+ "    (CASE "
			+ "        WHEN c.shippingFee = 0 THEN '0'"
			+ "        WHEN c.shippingFee < 50 THEN '1-49'"
			+ "        WHEN c.shippingFee < 100 THEN '50-99'"
			+ "        WHEN c.shippingFee < 200 THEN '100-199'"
			+ "        ELSE '200+'"
			+ "    END AS feeRange,"
			+ "    COUNT(*) AS feeCount)"
			+ " FROM "
			+ "    CustomerOrder c"
			+ " GROUP BY "
			+ "    CASE "
			+ "        WHEN c.shippingFee = 0 THEN '0'"
			+ "        WHEN c.shippingFee < 50 THEN '1-49'"
			+ "        WHEN c.shippingFee < 100 THEN '50-99'"
			+ "        WHEN c.shippingFee < 200 THEN '100-199'"
			+ "        ELSE '200+'"
			+ "    END"
			+ " ORDER BY "
			+ "    feeRange")
	@RequestMapping("/feeRangePerCount") 	
	List<FeeRangePerCount> feeRangePerCount();
	
}
