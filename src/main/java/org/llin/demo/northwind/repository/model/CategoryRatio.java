package org.llin.demo.northwind.data.repository.model;

public class CategoryRatio {
	private String category;
	private long productCount;
	private double percentage;

	public CategoryRatio(String category, Long productCount, Double percentage) {
		this.category = category;
		this.productCount = productCount;
		this.percentage = percentage;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getProductCount() {
		return productCount;
	}

	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
