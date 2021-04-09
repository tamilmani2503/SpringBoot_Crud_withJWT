package com.microcredential.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microcredential.userservice.exceptions.UserAlreadyExistsException;
import com.microcredential.userservice.exceptions.UserNotFoundException;
import com.microcredential.userservice.model.User;
import com.microcredential.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;

	}

	@Override
	public boolean saveUser(User user) throws UserAlreadyExistsException{
		Optional<User>	ul = userRepository.findById(user.getUserId());
		if (ul.isPresent()){
			throw new UserAlreadyExistsException("User already Exists");	
		}
		userRepository.save(user);
		return true;

	}

	@Override
	public User findByUsernameAndPassword(String username, String password) throws UserNotFoundException {
		User user = userRepository.findByUserNameAndPassword(username, password);
		if (user == null) {
			throw new UserNotFoundException("username and password mismatch");
		} else {
			return user;

		}
	}

}
