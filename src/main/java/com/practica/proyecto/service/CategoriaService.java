package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Categoria;
import com.practica.proyecto.repository.CategoriaRepository;

@Service 
public class CategoriaService {
	@Autowired 
	CategoriaRepository categoriaRepository ;
	public Categoria insertar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	public Categoria actualizar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	public List<Categoria> ver () {
		return categoriaRepository.findAll();	}

	public void eliminar(Categoria categoria) {
		categoriaRepository.delete(categoria);
	}
	}
	

