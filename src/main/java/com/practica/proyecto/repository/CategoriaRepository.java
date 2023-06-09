package com.practica.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica.proyecto.entity.Categoria;
@Repository 
public interface CategoriaRepository extends JpaRepository<Categoria , String> {

}
