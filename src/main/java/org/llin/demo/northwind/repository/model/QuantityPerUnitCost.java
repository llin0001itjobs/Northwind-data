package org.llin.demo.northwind.data.repository.model;

public class QuantityPerUnitCost {
	
	private double unitCost;
	
	private long totalQuantity;

	public double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
}
