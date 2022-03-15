package com.avanse.springboot.DTO.forms.miscellaneous;

import lombok.Data;

@Data
public class MoratoriumEILDTO {

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
