package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=_EntityNames.PAYMENT_TYPE)
public class PaymentType {

	@Id
	private String type;
	private String description;
	
	public PaymentType() {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PaymentType [type=" + type + ", description=" + description + "]";
	}

	
}
