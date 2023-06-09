package com.practica.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica.proyecto.entity.Articulo;
@Repository 
public interface ArticuloRepository extends JpaRepository<Articulo , String>{

}
