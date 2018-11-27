package com.hcl.dprism.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dprism.repositories.ServicesRepository;

@Service
public class ServicesDataImpl implements ServicesData{
	@Autowired
	private ServicesRepository servicesRepository;	
}
