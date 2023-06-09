package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Articulo")
@Table (name="Articulo")

public class Articulo {
	@Id 
	int codigo;
	int nombre;
	String stock;
	String descripcion;
	int imagen;
	int estado;
	public Articulo() {
		super();
	
	}
	public Articulo(int codigo, int nombre, String stock, String descripcion, int imagen, int estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.estado = estado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getImagen() {
		return imagen;
	}
	public void setImagen(int imagen) {
		this.imagen = imagen;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
