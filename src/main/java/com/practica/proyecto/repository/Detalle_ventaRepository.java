package com.practica.proyecto.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.practica.proyecto.entity.Detalle_venta;
@Repository 
public interface Detalle_ventaRepository extends JpaRepositoryImplementation<Detalle_venta , String> {

}
