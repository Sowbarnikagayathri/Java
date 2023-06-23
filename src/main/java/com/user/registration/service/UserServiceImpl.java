package com.user.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.registration.dao.UserDAO;
import com.user.registration.entity.Users;
import com.user.registration.exception.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userdao;

	 

	@Override
	public List<Users> getUsers() {

	return userdao.findAll();

	}

	@Override

	public Users addUsers(Users users) throws UserNotFoundException {
	if(users.getFirstname().isEmpty() || users.getFirstname().length()==0) {

	throw new UserNotFoundException();

	}

	else {

	Users u=userdao.save(users);

	return u;

	}

	 

	}
//	if(users.getFirstname() .length() || users.getFirstname().length() ==)

	 

	@Override

	public Users updateUsers(Users users) {

	userdao.save(users);

	return users;

	}

	 

	@Override

	public Users getUserById(int id)throws UserNotFoundException {

	Users u;

	if(userdao.findById(id).isEmpty()) {

	throw new UserNotFoundException();

	}

	else {

	u=userdao.findById(id).get();

	}

	return u;

	}

	 

	@Override

	public List<Users> GetRelatedUser() {

	return userdao.getUser();

	}

	 

	@Override

	public List<Users> GetUserName() {

	return userdao.getname();

	}
}
