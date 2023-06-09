package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Detalle_ingreso;
import com.practica.proyecto.repository.Detalle_ingresoRepository;


@Service
public class Detalle_ingresoService {
@Autowired 
Detalle_ingresoRepository detalle_ingreso;
public Detalle_ingreso insertar(Detalle_ingreso detalle_ingreso) {
	return this.detalle_ingreso.save(detalle_ingreso);
}
public Detalle_ingreso actualizar(Detalle_ingreso detalle_ingreso) {
	return this.detalle_ingreso.save(detalle_ingreso);
}
public List<Detalle_ingreso> ver() {
	return detalle_ingreso.findAll();
}

public void eliminar(Detalle_ingreso detalle_ingreso) {
	this.detalle_ingreso.delete(detalle_ingreso);
}
}
