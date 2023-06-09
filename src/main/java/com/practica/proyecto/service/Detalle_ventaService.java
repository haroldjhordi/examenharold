package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Detalle_venta;

import com.practica.proyecto.repository.Detalle_ventaRepository;

@Service 
public class Detalle_ventaService {
	@Autowired 
	Detalle_ventaRepository detalle_ventaVentaRepository;
	public Detalle_venta  insertar(Detalle_venta detalle_venta) {
		return detalle_ventaVentaRepository.save(detalle_venta);
	}
	public Detalle_venta  actualizar(Detalle_venta  detalle_venta) {
		return detalle_ventaVentaRepository.save(detalle_venta);
	}
	public List<Detalle_venta> ver() {
		return detalle_ventaVentaRepository.findAll();
		}
	public void eliminar(Detalle_venta detalle_venta) {
		detalle_ventaVentaRepository.delete(detalle_venta);
	}
	
	

}
