package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Persona;
import com.practica.proyecto.repository.PersonaRepository;

@Service 
public class PersonaService {
	@Autowired 
	PersonaRepository personaRepository ;
	public Persona  insertar(Persona  persona) {
		return personaRepository.save(persona);
	}
	public Persona actualizar(Persona persona) {
		return personaRepository.save(persona);
	}
	public List<Persona> ver (){
		return personaRepository.findAll();
	}
	public void eliminar(Persona persona) {
		personaRepository.delete(persona);
	}
	
		
}
