package com.practica.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name="Ingreso")
@Table (name="Ingreso")

public class Ingreso {
	@Id 
	int tipo_comprobante;
	int serie_comprobante;
	String num_comprobante;
	int fecha_hora;
	int impuesto;
	String estado;
	public Ingreso() {
		super();
		
	}
	public Ingreso(int tipo_comprobante, int serie_comprobante, String num_comprobante, int fecha_hora, int impuesto,
			String estado) {
		super();
		this.tipo_comprobante = tipo_comprobante;
		this.serie_comprobante = serie_comprobante;
		this.num_comprobante = num_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.estado = estado;
	}
	public int getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(int tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}
	public int getSerie_comprobante() {
		return serie_comprobante;
	}
	public void setSerie_comprobante(int serie_comprobante) {
		this.serie_comprobante = serie_comprobante;
	}
	public String getNum_comprobante() {
		return num_comprobante;
	}
	public void setNum_comprobante(String num_comprobante) {
		this.num_comprobante = num_comprobante;
	}
	public int getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(int fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public int getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
