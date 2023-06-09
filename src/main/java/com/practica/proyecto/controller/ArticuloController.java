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

import com.practica.proyecto.entity.Articulo;
import com.practica.proyecto.service.ArticuloService;

@RestController
@RequestMapping("/uno")
public class ArticuloController {
	@Autowired 
	ArticuloService articuloService;
	
	@GetMapping 
	public List<Articulo> mostrar(){
		return articuloService.ver();
		}
	@PostMapping 
	public Articulo registrar(@RequestBody  Articulo articulo) {
		return articuloService.insertar(articulo);
		}
	@PutMapping 
	public Articulo actuliaza(@RequestBody  Articulo articulo) {
		return articuloService.actualizar(articulo);
	}
	@DeleteMapping 
	public void borra(@RequestBody  Articulo articulo ) {
		articuloService.eliminar(articulo);
	}
	
	
	
}


