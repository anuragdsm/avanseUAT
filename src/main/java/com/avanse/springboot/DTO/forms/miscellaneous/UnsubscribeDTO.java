package com.avanse.springboot.DTO.forms.miscellaneous;

import lombok.Data;

@Data
public class UnsubscribeDTO {

	private String countryCode;
	private String contactNumber;
	private String loanAccountNumber;
}
