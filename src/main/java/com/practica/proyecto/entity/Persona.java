package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Persona")
@Table (name="Persona")

public class Persona {
	@Id 
	String tipo_persona;
	int nombre;
	int tipo_documento;
	int num_documento;
	int direccion;
	String telefono;
	String email;
	public Persona() {
		super();
		
	}
	public Persona(String tipo_persona, int nombre, int tipo_documento, int num_documento, int direccion,
			String telefono, String email) {
		super();
		this.tipo_persona = tipo_persona;
		this.nombre = nombre;
		this.tipo_documento = tipo_documento;
		this.num_documento = num_documento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	public String getTipo_persona() {
		return tipo_persona;
	}
	public void setTipo_persona(String tipo_persona) {
		this.tipo_persona = tipo_persona;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public int getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(int tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public int getNum_documento() {
		return num_documento;
	}
	public void setNum_documento(int num_documento) {
		this.num_documento = num_documento;
	}
	public int getDireccion() {
		return direccion;
	}
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
