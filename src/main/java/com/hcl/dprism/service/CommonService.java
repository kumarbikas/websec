package com.hcl.dprism.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.dprism.domain.User;


@Service
public interface CommonService {

	String userService();
	
	String addUser(String name,String email);

	void addUser(User user);

	Iterable<User> getAllUser();


	
}
