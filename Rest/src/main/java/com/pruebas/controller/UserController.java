package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.User;
import com.pruebas.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={"application/json"})
	public ResponseEntity<User> getUser(@PathVariable String id) {
//		User user = new User();
//		user.setAge(2);
//		user.setName("asdf");
//		user.setNickName("fdsa");
//		userService.addEntity(user);
//		return new ResponseEntity<User>(HttpStatus.OK);
		 User response = userService.getEntity(Integer.valueOf(id));
		 return new ResponseEntity<User>(response, HttpStatus.OK);
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
