package com.hcl.dprism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.dprism.domain.Company;
import com.hcl.dprism.repositories.CompanyRepository;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyRepo;
	
	@GetMapping("/company")
	public String showCountry(Model model,@RequestParam(defaultValue="0")int page){		
		model.addAttribute("data",companyRepo.findAll(PageRequest.of(page, 4)));
		return "countryView";
	}
	
	@PostMapping("/saveCountry")
	public String save(Company company) {
		companyRepo.save(company);
		return "redirect:/country";
		
	}
	
	@GetMapping("/delete")
	public String deleteCompany(Integer companyId) {
		companyRepo.deleteById(companyId);
		return "redirect:/country";
		
	}
	
	@GetMapping("/findOneCompany")
	public Company findOne(Integer companyId){	
		//companyRepo.findOne(companyId);
		return companyRepo.findById(companyId).get();
	}
}
