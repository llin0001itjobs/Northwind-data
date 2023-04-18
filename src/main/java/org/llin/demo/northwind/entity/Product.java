package org.llin.demo.northwind.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name=_EntityNames.PRODUCT)
public class Product {

	@Id
	private int id;

	@ManyToMany(mappedBy = "product", cascade = { CascadeType.ALL })
	private List<Supplier> supplier;

	@Value(value = "product_code")
	private String productCode;

	@Value(value = "product_name")
	private String productName;

	private String description;

	@Value(value = "standard_cost")
	private double standardCost;

	@Value(value = "list_price")
	private double listPrice;

	@Value(value = "reorder_level")
	private Integer reorderLevel;

	@Value(value = "target_level")
	private Integer targetLevel;

	@Value(value = "quantity_per_unit")
	private String quantityPerUnit;

	private boolean discontinued;

	@Value(value = "minimum_reorder_quantity")
	private Integer minimumReorderQuantity;

	private String category;

	@Value(value = "resource_id")
	private int resourceId;

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Supplier> getSuppliers() {
		return supplier;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.supplier = suppliers;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getStandardCost() {
		return standardCost;
	}

	public void setStandardCost(double standardCost) {
		this.standardCost = standardCost;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public Integer getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(Integer reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public Integer getTargetLevel() {
		return targetLevel;
	}

	public void setTargetLevel(Integer targetLevel) {
		this.targetLevel = targetLevel;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public Integer getMinimumReorderQuantity() {
		return minimumReorderQuantity;
	}

	public void setMinimumReorderQuantity(Integer minimumReorderQuantity) {
		this.minimumReorderQuantity = minimumReorderQuantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", supplier=" + supplier + ", productCode=" + productCode + ", productName="
				+ productName + ", description=" + description + ", standardCost=" + standardCost + ", listPrice="
				+ listPrice + ", reorderLevel=" + reorderLevel + ", targetLevel=" + targetLevel + ", quantityPerUnit="
				+ quantityPerUnit + ", discontinued=" + discontinued + ", minimumReorderQuantity="
				+ minimumReorderQuantity + ", category=" + category + ", resourceId=" + resourceId + "]";
	}

}
