package com.avanse.springboot.model.forms.miscellaneous;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CROSS_SELL")
public class CrossSell {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
