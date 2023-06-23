package com.user.registration.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.user.registration.entity.Users;
import com.user.registration.exception.UserNotFoundException;
import com.user.registration.service.UserService;

@RestController
public class UserController {
	@Autowired
	

	private UserService usersService;
	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());

	 @GetMapping("/users")

	public List<Users> getUsers(){

	return this.usersService.getUsers();

	}

	 @PostMapping("/users")

	public ResponseEntity addUsers(@RequestBody Users users)throws UserNotFoundException {

	Users u = usersService.addUsers(users);

	return new ResponseEntity<>(u, HttpStatus.CREATED);

	 

	}

	 @PutMapping("/users")

	public Users updateUsers(@RequestBody Users users) {

	return this.usersService.updateUsers(users);

	}

	 @GetMapping("/users/{usersid}")

	public ResponseEntity getUserById(@PathVariable("usersid") int id) throws UserNotFoundException{

	return new ResponseEntity(usersService.getUserById(id), HttpStatus.OK);

	}

	 @GetMapping("/relateduser")

	public List<Users> GetRelatedUser(){

	return this.usersService.GetRelatedUser();

	}

	 @GetMapping("/kname")

	public List<Users> GetUserName(){

	return this.usersService.GetUserName();

	}

	 

	}

	