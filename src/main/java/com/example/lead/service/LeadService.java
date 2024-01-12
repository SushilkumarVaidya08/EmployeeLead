package com.example.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lead.entity.Lead;
import com.example.lead.repository.LeadRepository;

@Service
public class LeadService {
	
	 @Autowired
	    private LeadRepository leadRepository;

	    public List<Lead> getLeadsByMobileNumber(Long mobileNumber) {
	        return leadRepository.findByMobileNumber(mobileNumber);
	    }

}
