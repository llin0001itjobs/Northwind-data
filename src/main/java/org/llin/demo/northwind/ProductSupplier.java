package org.llin.demo.northwind.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = _EntityNames.PRODUCT_SUPPLIER)
public class ProductSupplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int product_id;
	private int supplier_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	@Override
	public String toString() {
		return "ProductSupplier [id=" + id + ", product_id=" + product_id + ", supplier_id=" + supplier_id + "]";
	}







}
