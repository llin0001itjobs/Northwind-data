package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name=_EntityNames.PRIVILEGE)
public class Privilege {
	
	@Id
	private int id;
	
	@Value(value = "privilege_name")
	private String privilegeName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	@Override
	public String toString() {
		return "Privilege [id=" + id + ", privilegeName=" + privilegeName + "]";
	}
	
}
