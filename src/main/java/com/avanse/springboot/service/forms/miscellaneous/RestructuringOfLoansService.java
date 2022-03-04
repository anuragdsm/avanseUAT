package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.RestructuringOfLoans;
import com.avanse.springboot.repository.forms.miscellaneous.RestructuringOfLoansRepository;

@Service
public class RestructuringOfLoansService {

	@Autowired
	RestructuringOfLoansRepository restructuringOfLoansRepository;
	
	public List<RestructuringOfLoans> getRestructuringOfLoanDetails(){
		return restructuringOfLoansRepository.findAll();
	}
	
	public void addRestructuringOfLoans(RestructuringOfLoans restructuringOfLoans) {
		restructuringOfLoansRepository.save(restructuringOfLoans);
		
	}
	
	public long numberOfRestructuringOfLoansEntries() {
		return restructuringOfLoansRepository.count();
	}
	
	
}
