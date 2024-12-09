package org.llin.demo.northwind.data.repository.model;

public class ProductCountPerPriceRange {
	
	private String priceRange;
	
	private long productCount;

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public long getProductCount() {
		return productCount;
	}

	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}
	
	
	
}
