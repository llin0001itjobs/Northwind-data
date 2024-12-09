package org.llin.demo.northwind.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name=_EntityNames.ORDER_TAX_STATUS)
public class OrderTaxStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Value(value = "tax_status_name")
	private String taxStatusName;
	
	public OrderTaxStatus() {
		super();
	}

	public OrderTaxStatus(int id, String taxStatusName) {
		super();
		this.id = id;
		this.taxStatusName = taxStatusName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaxStatusName() {
		return taxStatusName;
	}

	public void setTaxStatusName(String taxStatusName) {
		this.taxStatusName = taxStatusName;
	}

	@Override
	public String toString() {
		return "OrderTaxStatus [id=" + id + ", taxStatusName=" + taxStatusName + "]";
	}

	
}
