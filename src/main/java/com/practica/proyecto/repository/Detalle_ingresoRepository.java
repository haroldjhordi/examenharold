package com.practica.proyecto.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.practica.proyecto.entity.Detalle_ingreso;
@Repository 
public interface Detalle_ingresoRepository extends JpaRepositoryImplementation<Detalle_ingreso, String> {

}
