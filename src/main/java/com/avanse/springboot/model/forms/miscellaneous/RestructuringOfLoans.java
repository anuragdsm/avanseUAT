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
@Table(name = "RESTRUCTURING_OF_LOANS")
public class RestructuringOfLoans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String loanAccountNumber;
	private String panNumber;
	private String mobileNumber;
	private String email;
	private String dateOfBirthOrIncorporation;

}
