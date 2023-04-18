package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int id;
	private String user;	
	private String password;
	
	public User() {
		super();
	}

	public User(int id, String user, String password) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", password=" + password + "]";
	}
	
		
}
