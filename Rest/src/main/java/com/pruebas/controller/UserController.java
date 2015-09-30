package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dto.UserDTO;
import com.pruebas.model.User;
import com.pruebas.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDTO> getUser(@PathVariable String id) {
		return null;
		// return new
		// ResponseEntity<UserDTO>(userService.getEntity(Integer.valueOf(id)),
		// HttpStatus.OK);
	}

	// @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	// public String getUser(@PathVariable String name) {
	// String result = "Hello " + name;
	// return result;
	// }

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User user) {
		return null;
	}
}
