package com.pruebas.dao;

import java.util.ArrayList;
import java.util.List;

import com.pruebas.model.User;

public class UserDAO implements GenericDAO<User> {

	@Override
	public boolean addEntity(User entity) {
		System.out.println("Agregando nuevo usuario");
		// Hagan un insert en base de datos
		// return false; Este return se hace si el insert falla
		return true; // Este return cuando el insert funciono
	}

	@Override
	public User getEntity(int id) {
		System.out.println("Obteniendo usuario por id");
		// Hagan un select por id en base de datos
		return new User();
	}

	@Override
	public List<User> getEntities() {
		System.out.println("Obteniendo todos los usuarios");
		// Usen este metodo para traer todos los user de base de dato
		List<User> user = new ArrayList<User>();
		user.add(new User());
		return null;
	}

	@Override
	public boolean updateEntity(User entity) {
		System.out.println("Update de usuario");
		// Hagan un update en base de datos
		// return false; Este return se hace si el update falla
		return true; // Este return cuando el update funciono
	}

}
