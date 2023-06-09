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

import com.practica.proyecto.entity.Categoria;
import com.practica.proyecto.service.CategoriaService;

@RestController 
@RequestMapping("/dos")
public class CategoriaController {
	@Autowired 
	CategoriaService categoriaService;
	
	@GetMapping 
	public List<Categoria> mostrar(){
		return categoriaService.ver();
	}
	@PostMapping 
	public Categoria registrar(@RequestBody Categoria categoria) {
		return categoriaService.insertar(categoria);
	}
	@PutMapping 
	public Categoria actualiza(@RequestBody Categoria categoria) {
		return categoriaService.actualizar(categoria);
	}
	@DeleteMapping 
	public void borra(@RequestBody Categoria categoria) {
		categoriaService.eliminar(categoria);
	}

}
