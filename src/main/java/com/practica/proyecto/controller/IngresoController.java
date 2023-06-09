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

import com.practica.proyecto.entity.Ingreso;
import com.practica.proyecto.service.IngresoService;

@RestController 
@RequestMapping("/cinco") 
public class IngresoController {
	@Autowired 
	IngresoService ingresoService ;
	@GetMapping
	public List<Ingreso > mostrar(){
		return ingresoService.ver();
	}
	@PostMapping 
	public Ingreso regritar(@RequestBody  Ingreso ingreso) {
		return ingresoService.insertar(ingreso);
	}
	@PutMapping 
	public Ingreso actualiza(@RequestBody  Ingreso ingreso) {
		return ingresoService.actualizar(ingreso);
	}
	@DeleteMapping 
	public void borra(@RequestBody  Ingreso ingreso) {
		ingresoService.eliminar(ingreso);
	}

}
