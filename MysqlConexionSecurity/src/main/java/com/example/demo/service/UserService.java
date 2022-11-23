package com.example.demo.service;

import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;

@Configuration
public class UserService {

	private List<User> users;
	
	public UserService(List<User> users) {
		
		this.users = users;
		users.add(new User("Carlos", "1234", Role.ADMIN));
		users.add(new User("Paco", "4312", Role.USER));
		
	}
	
}
