package com.avanse.springboot.DTO.forms.miscellaneous;
import lombok.Data;

@Data
public class CSRLeadsDTO {

	private Long id;
	
	private String name;
	private String contactNumber;
	private String email;
	private String subject;	
	private String message;
	
}
