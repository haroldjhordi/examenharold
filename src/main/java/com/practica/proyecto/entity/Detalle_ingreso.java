package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Detalle_ingreso")
@Table (name="Detalle_ingreso")

public class Detalle_ingreso {
	@Id 
	String cantidad;
	int precio_compra;
	int preccio_venta;
	public Detalle_ingreso() {
		super();
		
	}
	public Detalle_ingreso(String cantidad, int precio_compra, int preccio_venta) {
		super();
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.preccio_venta = preccio_venta;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}
	public int getPreccio_venta() {
		return preccio_venta;
	}
	public void setPreccio_venta(int preccio_venta) {
		this.preccio_venta = preccio_venta;
	}
	

}
