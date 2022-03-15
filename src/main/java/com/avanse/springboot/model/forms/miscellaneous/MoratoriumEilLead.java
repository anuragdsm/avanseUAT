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
@Table(name = "MORATORIUM_EIL_LEADS")
public class MoratoriumEilLead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String typeOfInstitution;
	private String institutionName;
	private String loanAmount;
	private String monthlyInstallment;
	private String wasMoratoriumAvailedInAprilOrMay;
	private String schoolZone;
	private String schoolOpeningDate;
	private String onlineDigitalClasses;
	private String feesReceievedTillDate;
	private String feesDue;
	private String reasonForRegisteringMoratoriumFacility;
	
}
