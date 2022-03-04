package com.avanse.springboot.DTO.forms.miscellaneous;

import lombok.Data;

@Data
public class RestructuringOfLoansDTO {

	private Long id;
	private String loanAccountNumber;
	private String panNumber;
	private String mobileNumber;
	private String email;
	private String dateOfBirthOrIncorporation;
}
