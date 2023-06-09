package com.practica.proyecto.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.practica.proyecto.entity.Users;
@Repository 
public interface UsersRepository extends JpaRepositoryImplementation<Users , String> {

}
