package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pruebas.dao.GenericDAO;
import com.pruebas.dto.UserDTO;
import com.pruebas.model.User;

@Service
public class UserService {

	GenericDAO<User> userDao;

	public boolean addEntity(UserDTO user) {
		userDao.addEntity(formatUser(user));
		return true;
	}

	public UserDTO getEntity(int id) {
		return formatUserDTO(userDao.getEntity(id));
	}

	public List<UserDTO> getEntities() {
		List<UserDTO> result = new ArrayList<UserDTO>();
		for (User user : userDao.getEntities()) {
			result.add(formatUserDTO(user));
		}
		return result;
	}

	public boolean updateEntity(UserDTO user) {
		userDao.updateEntity(formatUser(user));
		return true;
	}

	private User formatUser(UserDTO user) {
		return new User(); // Cambios necesarios de UserDTO a User
	}

	private UserDTO formatUserDTO(User user) {
		return new UserDTO(); // Cambios necesarios de User a UserDTO
	}

}
