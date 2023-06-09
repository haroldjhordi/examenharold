package com.practica.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.proyecto.entity.Users;
import com.practica.proyecto.repository.UsersRepository;

@Service 
public class UsersService {
	@Autowired 
	UsersRepository usersRepository;
	public Users  insertar(Users users) {
		return usersRepository.save(users);
		}
	public Users actualizar(Users users) {
		return usersRepository.save(users);
	}
	public List<Users> ver() {
		return usersRepository.findAll();
	}
	public void eliminar(Users users) {
		usersRepository.delete(users);
	}

}
