package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Categoria")
@Table (name="Categoria")

public class Categoria {
	@Id 
	int nombre;
	String descripcion;
	int condicion;
	public Categoria() {
		super();
		
	}
	public Categoria(int nombre, String descripcion, int condicion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.condicion = condicion;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCondicion() {
		return condicion;
	}
	public void setCondicion(int condicion) {
		this.condicion = condicion;
	}
	

}
