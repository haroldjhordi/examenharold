package com.practica.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.proyecto.entity.Venta;
import com.practica.proyecto.service.VentaService;

@RestController 
@RequestMapping ("/siete")
public class VentaController {
	@Autowired 
	VentaService ventaService;
	@GetMapping 
	public List<Venta> mostrar(){
		return ventaService.ver();
	}
	@PostMapping 
	public Venta registrar(@RequestBody   Venta venta) {
		return ventaService.insertar(venta);
	}
	@PutMapping 
	public Venta actualiza(@RequestBody  Venta venta) {
		return ventaService.actualizar(venta);
	}
	@DeleteMapping 
	public void borra(@RequestBody Venta venta) {
		ventaService.eliminar(venta);
	}

}
