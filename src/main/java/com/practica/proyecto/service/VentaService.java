package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Venta;
import com.practica.proyecto.repository.VentaRepository;

@Service 
public class VentaService {
	@Autowired 
	VentaRepository ventaRepository;
	public Venta  insertar(Venta venta) {
		return ventaRepository.save(venta);
	}
	public Venta actualizar(Venta venta) {
		return ventaRepository.save(venta);
	}
	public List<Venta> ver() {
		return ventaRepository.findAll();
	}
	public void eliminar(Venta venta) {
		ventaRepository.delete(venta);
	}

}
