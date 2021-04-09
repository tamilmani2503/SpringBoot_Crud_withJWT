package com.microcredential.userservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microcredential.userservice.exceptions.UserNotFoundException;
import com.microcredential.userservice.model.User;
import com.microcredential.userservice.service.SecurityTokenGenerator;
import com.microcredential.userservice.service.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path="/api/v1/authservice")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private SecurityTokenGenerator securityTokenGenerator;

	@PostMapping("/register")
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		try {
			userService.saveUser(user);
			return new ResponseEntity<>(HttpStatus.CREATED);			
		}catch (Exception e) {
			return new ResponseEntity<String>("{ \"message\":\""+e.getMessage(), HttpStatus.CONFLICT);
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user) throws UserNotFoundException {
		Map<String, String> map = null;
		try {
			if (user.getUserName() ==  null || user.getPassword() == null){
				throw new Exception("User or password Cannot be empty");
			}
			User userObj = userService.findByUsernameAndPassword(user.getUserName(), user.getPassword());
			if (userObj != null){
				map = securityTokenGenerator.generateToken(userObj);
				return new ResponseEntity<Map<String,String>>(map, HttpStatus.OK);
			} else {
				return new ResponseEntity<>( HttpStatus.OK);
			}			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.OK);
		}


	}
}
