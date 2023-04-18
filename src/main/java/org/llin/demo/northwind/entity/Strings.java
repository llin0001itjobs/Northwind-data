package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = _EntityNames.STRINGS)
public class Strings {
	
	@Id
	private int id;
	
	@Value(value = "string_data")
	private String stringData;
	
	public Strings() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStringData() {
		return stringData;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

	@Override
	public String toString() {
		return "Strings [id=" + id + ", stringData=" + stringData + "]";
	}
	
}
