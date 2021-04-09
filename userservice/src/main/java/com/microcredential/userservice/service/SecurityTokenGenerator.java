package com.microcredential.userservice.service;

import java.util.Map;

import com.microcredential.userservice.model.User;;;

public interface SecurityTokenGenerator {
	
	Map<String, String> generateToken(User user);

}
