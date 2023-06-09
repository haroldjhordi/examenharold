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

import com.practica.proyecto.entity.Detalle_ingreso;
import com.practica.proyecto.service.Detalle_ingresoService;

@RestController
@RequestMapping("/tres")
public class Detalle_ingresoController {
	@Autowired 
	Detalle_ingresoService detalle_ingresoService;
	
	@GetMapping 
	public List<Detalle_ingreso > mostrar() {
		return detalle_ingresoService.ver();
		}
	@PostMapping 
	public Detalle_ingreso registrar(@RequestBody  Detalle_ingreso detalle_ingreso) {
		return detalle_ingresoService.insertar(detalle_ingreso);
	}
	@PutMapping
	public Detalle_ingreso actualiza(@RequestBody  Detalle_ingreso detalle_ingreso) {
		return detalle_ingresoService.actualizar(detalle_ingreso);
	}
	@DeleteMapping 
	public void borra(@RequestBody  Detalle_ingreso detalle_ingreso) {
		detalle_ingresoService.eliminar(detalle_ingreso);
	}
	

}
