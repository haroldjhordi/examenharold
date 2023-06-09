package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Articulo;
import com.practica.proyecto.repository.ArticuloRepository;

@Service 
public class ArticuloService {
	@Autowired
	ArticuloRepository articuloRepository;
	public Articulo  insertar(Articulo articulo) { 
		return articuloRepository.save(articulo);
	}
	ArticuloRepository articuloRepository2;
	public Articulo actualizar(Articulo articulo) {
		return articuloRepository.save(articulo);
	}
	public List<Articulo> ver () {
		return articuloRepository.findAll();
		}
	public void eliminar(Articulo articulo) {
		articuloRepository.delete(articulo);
	}

}
