package org.llin.demo.northwind.data.repository;

import java.util.List;

import org.llin.demo.northwind.data.entity.CustomerOrder;
import org.llin.demo.northwind.data.repository.model.FeeRangePerCount;
import org.llin.demo.northwind.data.repository.model.ShippingFeePerMonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customerOrder")
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	@Query("SELECT "
			+ "    EXTRACT(MONTH FROM c.shippedDate) AS month,"
			+ "    SUM(c.shippingFee) AS total_shipping_fee"
			+ " FROM "
			+ "    CustomerOrder c"
			+ " WHERE "
			+ "    c.shippedDate IS NOT NULL"
			+ " GROUP BY "
			+ "    EXTRACT(MONTH FROM c.shippedDate)"
			+ " ORDER BY "
			+ "    month")
	List<ShippingFeePerMonth> getShippingFeePerMonth();
	

	@Query("SELECT "
			+ "    CASE "
			+ "        WHEN c.shippingFee = 0 THEN '0'"
			+ "        WHEN c.shippingFee < 50 THEN '1-49'"
			+ "        WHEN c.shippingFee < 100 THEN '50-99'"
			+ "        WHEN c.shippingFee < 200 THEN '100-199'"
			+ "        ELSE '200+'"
			+ "    END AS fee_range,"
			+ "    COUNT(*) AS fee_count"
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
			+ "    fee_range")
	List<FeeRangePerCount> getFeeRangePerCount();
	
}
