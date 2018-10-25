package com.hcl.dprism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcl.dprism.domain.Company;
import com.hcl.dprism.repositories.CompanyRepository;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyRepo;
	
	@GetMapping("/company")
	public String showCountry(Model model,@RequestParam(defaultValue="0")int page){		
		model.addAttribute("data",companyRepo.findAll(PageRequest.of(page, 4)));
		model.addAttribute("currentPage", page);
		return "companyView";
	}
	
	@PostMapping("/saveCompany")
	public String save(Company company) {
		companyRepo.save(company);
		System.out.println("printing companyid:"+company.getCompanyId());
		return "redirect:/company";
		
	}
	
	@GetMapping("/deleteCompany")
	public String deleteCompany(Integer companyId) {
		companyRepo.deleteById(companyId);
		return "redirect:/company";
		
	}
	
	@GetMapping("/findOneCompany")
	@ResponseBody
	public Company findOne(Integer companyId){	
		//companyRepo.findOne(companyId);
		return companyRepo.findById(companyId).get();
	}
}
