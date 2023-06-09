package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Venta")
@Table (name="Venta")

public class Venta {
	@Id 
String tipo_comprobante;
int serie_comprobante;
int num_comprobante;
int fecha_hora;
String impuesto;
int total_ventas;
int estado;
public Venta() {
	super();

}
public Venta(String tipo_comprobante, int serie_comprobante, int num_comprobante, int fecha_hora, String impuesto,
		int total_ventas, int estado) {
	super();
	this.tipo_comprobante = tipo_comprobante;
	this.serie_comprobante = serie_comprobante;
	this.num_comprobante = num_comprobante;
	this.fecha_hora = fecha_hora;
	this.impuesto = impuesto;
	this.total_ventas = total_ventas;
	this.estado = estado;
}
public String getTipo_comprobante() {
	return tipo_comprobante;
}
public void setTipo_comprobante(String tipo_comprobante) {
	this.tipo_comprobante = tipo_comprobante;
}
public int getSerie_comprobante() {
	return serie_comprobante;
}
public void setSerie_comprobante(int serie_comprobante) {
	this.serie_comprobante = serie_comprobante;
}
public int getNum_comprobante() {
	return num_comprobante;
}
public void setNum_comprobante(int num_comprobante) {
	this.num_comprobante = num_comprobante;
}
public int getFecha_hora() {
	return fecha_hora;
}
public void setFecha_hora(int fecha_hora) {
	this.fecha_hora = fecha_hora;
}
public String getImpuesto() {
	return impuesto;
}
public void setImpuesto(String impuesto) {
	this.impuesto = impuesto;
}
public int getTotal_ventas() {
	return total_ventas;
}
public void setTotal_ventas(int total_ventas) {
	this.total_ventas = total_ventas;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}

}
