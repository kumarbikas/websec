package com.hcl.dprism.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dprism.domain.AppUser;
import com.hcl.dprism.repositories.UserRepository;
import com.hcl.dprism.service.CommonService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private UserRepository userRepository;	

	@GetMapping("/userName")
	public String getUserName(){
		
		return commonService.userService()+" Bikash";
	}
	
	@GetMapping("/getloggedinuser")
	public String getLoggedinUserName(){
		
		return commonService.userService()+"logged Bikash";
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {	

	
		return commonService.addUser(name, email);
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(path="/all")
	public @ResponseBody Iterable<AppUser> getAllUsers() {
		// This returns a JSON or XML with the users
		return commonService.getAllUser();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping("/userDetails")
	public Iterable<AppUser> getUserDetail() {
		return commonService.getAllUser();
	}
	
	@CrossOrigin(origins="*")
	@PostMapping(path = "/userDetails", consumes = "application/json", produces = "application/json")
	public void addUser	(@RequestBody AppUser user){
		commonService.addUser(user);
	}
	
	 @RequestMapping("/hello")
	    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	        model.addAttribute("name", name);
	        return "hello,This is Dprism";
	    }
	
	

}
