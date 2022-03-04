package com.avanse.springboot.DTO.forms.miscellaneous;

import lombok.Data;

@Data
public class MoratoriumFacilityDTO {
	
	private Long id;
	private String panNumber;
	private String loanAccountNumber;
	private String alternateMobileNumber;
	private String dateOfBirthOrIncorporation;

}
