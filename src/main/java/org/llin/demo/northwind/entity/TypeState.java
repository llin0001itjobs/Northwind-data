package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=_EntityNames.TYPE_STATE)
public class TypeState {

	@Id
	private String code;
	
	private String description;
	
	public TypeState() {
		super();
	}

	public TypeState(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TypeState [code=" + code + ", description=" + description + "]";
	}
	
		
}
