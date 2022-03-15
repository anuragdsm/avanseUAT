package com.avanse.springboot.DTO.forms.miscellaneous;

import lombok.Data;

@Data
public class CrossSellDTO {

	private Long id;
	private String customerName;
	private String customerEmail;
	private String mobileNumber;

	private String city;
	private String childName;
	private String schoolOrInstituteName;
	private String classOfStudent;
	private String rollNo;
	private String admissionOrStudentID;
	private String annualSchoolFees;
	private String loanAmount;
	private String consent;
}
