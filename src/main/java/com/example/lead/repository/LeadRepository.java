package com.example.lead.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lead.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
	
	 List<Lead> findByMobileNumber(Long mobileNumber);

}
