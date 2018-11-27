package com.hcl.dprism.service;

import org.springframework.stereotype.Service;

import com.hcl.dprism.domain.AppUser;


@Service
public interface CommonService {

	String userService();
	
	String addUser(String name,String email);

	void addUser(AppUser user);

	Iterable<AppUser> getAllUser();


	
}
