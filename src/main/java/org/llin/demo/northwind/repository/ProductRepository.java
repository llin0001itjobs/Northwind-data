package org.llin.demo.northwind.data.repository;

import java.util.List;

import org.llin.demo.northwind.data.entity.Product;
import org.llin.demo.northwind.data.repository.model.CategoryRatio;
import org.llin.demo.northwind.data.repository.model.ProductCountPerPriceRange;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
    @Query("SELECT category, COUNT(*) as product_count, ROUND(COUNT(*) * 100.0 / (SELECT COUNT(*) FROM Product),2) as percentage"
    		+ " FROM Product "
    		+ " GROUP BY category"
    		+ " ORDER BY category")
    List<CategoryRatio> getCategoryRatios();
    
    @Query("SELECT "
    		+ "    CASE "
    		+ "        WHEN standard_cost < 12.5 THEN '0.5 - 12.49'"
    		+ "        WHEN standard_cost < 25 THEN '12.5 - 24.99'"
    		+ "        WHEN standard_cost < 37.5 THEN '25 - 37.49'"
    		+ "        WHEN standard_cost < 50 THEN '37.5 - 49.99'"
    		+ "        ELSE '50 - 60.75'"
    		+ "    END AS price_range,"
    		+ "    COUNT(*) AS product_count"
    		+ " FROM "
    		+ "   Product"
    		+ " GROUP BY "
    		+ "    CASE "
    		+ "        WHEN standard_cost < 12.5 THEN '0.5 - 12.49'"
    		+ "        WHEN standard_cost < 25 THEN '12.5 - 24.99'"
    		+ "        WHEN standard_cost < 37.5 THEN '25 - 37.49'"
    		+ "        WHEN standard_cost < 50 THEN '37.5 - 49.99'"
    		+ "        ELSE '50 - 60.75'"
    		+ "    END"
    		+ " ORDER BY "
    		+ "    price_range")
    List<ProductCountPerPriceRange>getPriceRangePerStandardCost();
    
    @Query("SELECT "
    		+ "    CASE "
    		+ "        WHEN list_price < 17.60 THEN '1.80 - 17.59'"
    		+ "        WHEN list_price < 34.20 THEN '17.60 - 34.19'"
    		+ "        WHEN list_price < 50.80 THEN '34.20 - 50.79'"
    		+ "        WHEN list_price < 67.40 THEN '50.80 - 67.39'"
    		+ "        ELSE '67.40 - 81.00'"
    		+ "    END AS price_range,"
    		+ "    COUNT(*) AS product_count"
    		+ " FROM "
    		+ "    Product"
    		+ " GROUP BY "
    		+ "    CASE "
    		+ "        WHEN list_price < 17.60 THEN '1.80 - 17.59'"
    		+ "        WHEN list_price < 34.20 THEN '17.60 - 34.19'"
    		+ "        WHEN list_price < 50.80 THEN '34.20 - 50.79'"
    		+ "        WHEN list_price < 67.40 THEN '50.80 - 67.39'"
    		+ "        ELSE '67.40 - 81.00'"
    		+ "    END"
    		+ " ORDER BY "
    		+ "    price_range")
    List<ProductCountPerPriceRange>getPriceRangePerListPrice();	
    
	Page<Product> findByCategoryOrderByProductNameAsc(String Category, Pageable pageable);

	Page<Product> findByCategoryOrderByProductNameDesc(String Category, Pageable pageable);

	Page<Product> findByListPriceBetweenOrderByListPriceAsc(Double listPrice1, Double listPrice2, Pageable pageable);

	Page<Product> findByListPriceBetweenOrderByListPriceDesc(Double listPrice1, Double listPrice2, Pageable pageable);

	Page<Product> findByStandardCostBetweenOrderByStandardCostAsc(Double standardCost1, Double standardCost2,
			Pageable pageable);

	Page<Product> findByStandardCostBetweenOrderByStandardCostDesc(Double standardCost1, Double standardCost2,
			Pageable pageable);

	Page<Product> findByMinimumReorderQuantityBetweenOrderByMinimumReorderQuantityAsc(Integer minimumReorderQuantity1,
			Integer minimumReorderQuantity2, Pageable pageable);

	Page<Product> findByMinimumReorderQuantityBetweenOrderByMinimumReorderQuantityDesc(Integer minimumReorderQuantity1,
			Integer minimumReorderQuantity2, Pageable pageable);

	Page<Product> findByReorderLevelBetweenOrderByReorderLevelAsc(Integer reorderLevel1, Integer reorderLevel2,
			Pageable pageable);

	Page<Product> findByReorderLevelBetweenOrderByReorderLevelDesc(Integer reorderLevel1, Integer reorderLevel2,
			Pageable pageable);
	
	Page<Product> findByTargetLevelBetweenOrderByTargetLevelAsc(Integer targetLevel1, Integer targetLevel2,
			Pageable pageable);

	Page<Product> findByTargetLevelBetweenOrderByTargetLevelDesc(Integer targetLevel1, Integer targetLevel2,
			Pageable pageable);
	
	
		
}
