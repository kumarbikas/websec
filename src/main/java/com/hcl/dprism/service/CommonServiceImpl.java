package com.hcl.dprism.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dprism.domain.User;
import com.hcl.dprism.repositories.UserRepository;

@Service
public class CommonServiceImpl implements CommonService {
	@Autowired
	private UserRepository userRepository;	
	
	
	@Override
	public String userService(){
	return "hello mr";
}

	@Override
	public String addUser(String name, String email) {
		// TODO Auto-generated method stub
		// @ResponseBody means the returned String is the response, not a view name
				// @RequestParam means it is a parameter from the GET or POST request
		User n = new User();
		n.setFullName(name);
		n.setEmailAddress(email);
		userRepository.save(n);
		return "saved";
	}

	@Override
	public void addUser(User user) {
		((List<User>) user).add(user);
		
	}

	@Override
	public  Iterable<User> getAllUser() {
		return userRepository.findAll();
	}
}
