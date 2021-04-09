package com.microcredential.userservice.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.microcredential.userservice.model.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator {

	@Override
	public Map<String, String> generateToken(User user) {

		String jwtToken = "";

		jwtToken = Jwts.builder().setSubject(String.valueOf(user.getUserId())).setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "microcredential").compact();

		Map<String, String> map = new HashMap<>();
		map.put("token", jwtToken);
		return map;
	}

}
