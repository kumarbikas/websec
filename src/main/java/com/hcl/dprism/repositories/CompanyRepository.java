package com.hcl.dprism.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.dprism.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
