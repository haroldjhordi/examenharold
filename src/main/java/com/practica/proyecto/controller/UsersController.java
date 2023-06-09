package com.practica.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.proyecto.entity.Users;
import com.practica.proyecto.service.UsersService;

@RestController 
@RequestMapping("/seis")

public class UsersController {
	@Autowired 
	UsersService usersService;
	@GetMapping 
	public List<Users > mostrar(){
		return usersService.ver();
	}
	@PostMapping 
	public Users registrar(@RequestBody  Users users) {
		return usersService.insertar(users);
	}
	@PutMapping 
	public Users actualiza(@RequestBody   Users users) {
		return usersService.actualizar(users);
	}
	@DeleteMapping 
	public void borra(@RequestBody  Users users) {
		usersService.eliminar(users);
	}

}
