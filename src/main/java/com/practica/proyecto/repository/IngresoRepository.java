package com.practica.proyecto.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.practica.proyecto.entity.Ingreso;
@Repository 
public interface IngresoRepository extends JpaRepositoryImplementation<Ingreso , String> {

}
