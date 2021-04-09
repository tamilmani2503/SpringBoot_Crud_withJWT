package com.microcredential.userservice.service;

import com.microcredential.userservice.exceptions.UserAlreadyExistsException;
import com.microcredential.userservice.exceptions.UserNotFoundException;
import com.microcredential.userservice.model.User;

public interface UserService {

	boolean saveUser(User user) throws UserAlreadyExistsException, UserNotFoundException;
	public User findByUsernameAndPassword(String username, String password) throws UserNotFoundException;
}
