package com.snake.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snake.workshopmongo.domain.User;
import com.snake.workshopmongo.repository.UserRepository;

@Service
public class userService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
