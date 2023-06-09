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

import com.practica.proyecto.entity.Detalle_venta;
import com.practica.proyecto.service.Detalle_ventaService;

@RestController 
@RequestMapping("/cuatro")
public class Detalle_ventaController {
	@Autowired 
	Detalle_ventaService detalle_ventaVentaService;
	
	@GetMapping 
	public List<Detalle_venta> mostrar(){
		return detalle_ventaVentaService.ver();	}
	
	@PostMapping 
	public Detalle_venta resgistrar(@RequestBody  Detalle_venta detalle_venta) {
		return detalle_ventaVentaService.insertar(detalle_venta);
	}
	@PutMapping
	public Detalle_venta actualiza(@RequestBody  Detalle_venta detalle_venta) {
		return detalle_ventaVentaService.actualizar(detalle_venta);
	}
	@DeleteMapping 
	public void borra(@RequestBody  Detalle_venta detalle_venta) {
		detalle_ventaVentaService.eliminar(detalle_venta);
	}
	}
