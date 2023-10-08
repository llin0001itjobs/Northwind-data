package org.llin.demo.northwind.repository;

import org.llin.demo.northwind.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {

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
