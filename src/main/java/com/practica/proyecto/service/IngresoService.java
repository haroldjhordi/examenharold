package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Ingreso;
import com.practica.proyecto.repository.IngresoRepository;

@Service 
public class IngresoService {
	@Autowired 
	IngresoRepository ingresoRepository;
	public Ingreso  insertar( Ingreso ingreso) {
		return ingresoRepository.save(ingreso);
	}
	public Ingreso actualizar(Ingreso ingreso) {
		return ingresoRepository.save(ingreso);
	}
	public List<Ingreso> ver() {
		return ingresoRepository.findAll();
	}
	public void eliminar(Ingreso ingreso) {
		ingresoRepository.delete(ingreso);
	}

}
