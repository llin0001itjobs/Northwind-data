package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name=_EntityNames.ORDER_STATUS)
public class OrderStatus {
	
	@Id
	private int id;
	
	@Value(value = "status_name")
	private String statusName;

	public OrderStatus() {
		super();
	}

	public OrderStatus(int id, String statusName) {
		super();
		this.id = id;
		this.statusName = statusName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "OrderStatus [id=" + id + ", statusName=" + statusName + "]";
	}
	
	
	
}
