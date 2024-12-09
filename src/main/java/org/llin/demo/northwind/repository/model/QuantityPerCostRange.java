package org.llin.demo.northwind.data.repository.model;

public class QuantityPerCostRange {
	
	private String costRange;
	
	private long totalQuantity;

	public String getCostRange() {
		return costRange;
	}

	public void setCostRange(String costRange) {
		this.costRange = costRange;
	}

	public long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
}
