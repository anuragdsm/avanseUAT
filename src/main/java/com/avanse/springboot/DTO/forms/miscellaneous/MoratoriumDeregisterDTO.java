package com.avanse.springboot.DTO.forms.miscellaneous;

import lombok.Data;

@Data
public class MoratoriumDeregisterDTO {

	private Long id;
	private String name;
	private String loanAccountNumber;
	private String mobileNumber;
	private String alternateNumber;
	private String email;
	private String dateOfBirthOrIncorporation;
}
