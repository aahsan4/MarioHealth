package com.mario.proto.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mario.proto.data.User;
import com.mario.proto.service.UserService;

/**
 * Controller for User
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping(value = "/login/{email}", produces = "application/json")
	public ResponseEntity<User> userLogIn(@PathVariable String email) throws NoSuchElementException {

		return ResponseEntity.ok(userService.userLogIn(email));
	}

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

}
