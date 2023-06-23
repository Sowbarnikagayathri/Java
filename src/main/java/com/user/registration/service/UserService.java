package com.user.registration.service;

import java.util.List;

import com.user.registration.entity.Users;
import com.user.registration.exception.UserNotFoundException;

public interface UserService {

	public List<Users> getUsers();

	public Users addUsers(Users users) throws UserNotFoundException;

	public Users updateUsers(Users users);

	public Users getUserById(int id)throws UserNotFoundException;

	public List<Users> GetRelatedUser();

	public List<Users> GetUserName();


}
