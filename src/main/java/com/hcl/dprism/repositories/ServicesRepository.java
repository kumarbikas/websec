package com.hcl.dprism.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.dprism.domain.Services;
//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface ServicesRepository extends JpaRepository<Services, Integer>{

}
