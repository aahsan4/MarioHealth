package com.mario.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mario.proto.data.User;
import com.mario.proto.repository.UserRepository;

/**
 * Service for User
 */

@Service
public class UserService {

	@Autowired
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public User userLogIn(String email) {

		User user = this.userRepository.findByEmail(email);

		return user;
	}

	public User saveUser(User user) {
		
		return userRepository.save(user);
		
	}

}
