package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=_EntityNames.PURCHASE_ORDER_STATUS)
public class PurchaseOrderStatus {

	@Id
	private int id;
	private String status;

	public PurchaseOrderStatus() {
		super();
	}

	public PurchaseOrderStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PurchaseOrderStatus [id=" + id + ", status=" + status + "]";
	}
	
}
