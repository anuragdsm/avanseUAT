package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.AssociateWithUs;
import com.avanse.springboot.repository.forms.miscellaneous.AssociateWithUsRepository;

@Service
public class AssociateWithUsService {

	@Autowired
	AssociateWithUsRepository associateWithUsRepository;
	
	public List<AssociateWithUs> getAssociateWithUsLeads(){
		return associateWithUsRepository.findAll();
	}
	
	public void addAssociateWithUsLead(AssociateWithUs associateWithUs) {
		associateWithUsRepository.save(associateWithUs);
	}
	
	public long numberOfAssociateWithUsLeads() {
		return associateWithUsRepository.count();
	}
	
}
