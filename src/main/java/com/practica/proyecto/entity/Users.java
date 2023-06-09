package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Users")
@Table (name="Users")

public class Users {
	@Id 
	String name;
	int email;
	int passwoerd;
	public Users() {
		super();
		
	}
	public Users(String name, int email, int passwoerd) {
		super();
		this.name = name;
		this.email = email;
		this.passwoerd = passwoerd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getPasswoerd() {
		return passwoerd;
	}
	public void setPasswoerd(int passwoerd) {
		this.passwoerd = passwoerd;
	}
	

}
