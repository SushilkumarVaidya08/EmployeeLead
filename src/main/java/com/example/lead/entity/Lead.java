package com.example.lead.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lead")
public class Lead {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer leadId;

    private String firstName;

    private String middleName;

    private String lastName;

    private Long mobileNumber;

    private String gender;

    private Date dob;

    private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLeadId() {
		return leadId;
	}

	public void setLeadId(Integer leadId) {
		this.leadId = leadId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lead(Long id, Integer leadId, String firstName, String middleName, String lastName, Long mobileNumber,
			String gender, Date dob, String email) {
		super();
		this.id = id;
		this.leadId = leadId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
	}
    
    

}
