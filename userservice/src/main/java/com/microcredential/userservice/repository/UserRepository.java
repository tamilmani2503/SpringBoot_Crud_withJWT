package com.microcredential.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microcredential.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserNameAndPassword(String userName, String password);

}







	

