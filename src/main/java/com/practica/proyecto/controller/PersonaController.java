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

import com.practica.proyecto.entity.Persona;
import com.practica.proyecto.service.PersonaService;

@RestController 
@RequestMapping("/aplicativo")
public class PersonaController {
	
	@Autowired 
	PersonaService personaService ;
	
	@GetMapping 
	public List<Persona> mostrar(){
		return personaService.ver();
		}
	@PostMapping
	public Persona registrar(@RequestBody  Persona persona) {
		return personaService.insertar(persona);
	}
	@PutMapping
	public Persona actuliza(@RequestBody Persona persona) {
		return personaService.actualizar(persona);
	}
	@DeleteMapping 
	public void borra(@RequestBody  Persona persona) {
		personaService.eliminar(persona);
	}

}
