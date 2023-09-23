package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role implements _Entity {

	@Id
	private String type;
	private String description;

	public Role() {
		super();
	}

	public Role(String type, String description) {
		super();
		this.type = type;
		this.description = description;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
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
		return "Role [type=" + type + ", description=" + description + "]";
	}



}
