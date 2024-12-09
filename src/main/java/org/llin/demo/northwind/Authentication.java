package org.llin.demo.northwind.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name=_EntityNames.AUTHENTICATION)
public class Authentication implements _Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Value(value = "role_type")
	private String roleType;
	
	@Value(value = "user_name")
	private String userName;
		
	private String password;

	public Authentication() {
		super();
	}

	public Authentication(int id, String roleType, String userName, String password) {
		super();
		this.id = id;
		this.roleType = roleType;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Authentication [id=" + id + ", roleType=" + roleType + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
	
}
