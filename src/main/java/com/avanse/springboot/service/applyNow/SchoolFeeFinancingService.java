package com.avanse.springboot.service.applyNow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.applyNow.SchoolFeeFinancing;
import com.avanse.springboot.repository.forms.applyNow.SchoolFeeFinancingRepository;

@Service
public class SchoolFeeFinancingService {
	@Autowired
	SchoolFeeFinancingRepository schoolFeeFinancingRepository;
	
	public List<SchoolFeeFinancing> getSchoolFeeFinancingLeads(){
		return schoolFeeFinancingRepository.findAll();
	}
	
	public void addSchoolFeeFinancingLead(SchoolFeeFinancing schoolFeeFinancing) {
		schoolFeeFinancingRepository.save(schoolFeeFinancing);
	}
	
	public long numberOfSchoolFeeFinancingLeads() {
		return schoolFeeFinancingRepository.count();
	}

}
