package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Detalle_venta")
@Table (name="Detalle_venta")

public class Detalle_venta {
	@Id 
String cantidad;
int precio_venta;
String descuento;
public Detalle_venta() {
	super();
	
}
public Detalle_venta(String cantidad, int precio_venta, String descuento) {
	super();
	this.cantidad = cantidad;
	this.precio_venta = precio_venta;
	this.descuento = descuento;
}
public String getCantidad() {
	return cantidad;
}
public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}
public int getPrecio_venta() {
	return precio_venta;
}
public void setPrecio_venta(int precio_venta) {
	this.precio_venta = precio_venta;
}
public String getDescuento() {
	return descuento;
}
public void setDescuento(String descuento) {
	this.descuento = descuento;
}

}
