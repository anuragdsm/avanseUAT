package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.CSRLeads;
import com.avanse.springboot.repository.forms.miscellaneous.CSRLeadsRepository;

@Service
public class CSRLeadsService {

	@Autowired
	CSRLeadsRepository csrLeadsRepository;
	
	public List<CSRLeads> getCSRLeads(){
		return csrLeadsRepository.findAll();
	}
	
	public void addCSRLead(CSRLeads csrLeads) {
		csrLeadsRepository.save(csrLeads);
	}
	
	public long numberOfCSRLeads() {
		return csrLeadsRepository.count();
	}
	
	
}
