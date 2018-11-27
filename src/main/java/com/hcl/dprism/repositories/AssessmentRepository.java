package com.hcl.dprism.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.dprism.domain.Assessment;

public interface AssessmentRepository extends JpaRepository<Assessment, Integer>{

}
