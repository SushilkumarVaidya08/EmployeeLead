package com.example.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lead.errorresponse.ApiResponse;
import com.example.lead.errorresponse.ErrorResponse;
import com.example.lead.service.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadController {
	
	 @Autowired
	    private LeadService leadService;

	    @GetMapping("/mobile/{mobileNumber}")
	    public ResponseEntity<?> getLeadsByMobileNumber(@PathVariable Long mobileNumber) {
	        List<Lead> leads = leadService.getLeadsByMobileNumber(mobileNumber);

	        if (leads.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse("error", "E10011", "No Lead found with the Mobile Number " + mobileNumber));
	        } else {
	            return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse("success", leads));
	        }
	    }

}
