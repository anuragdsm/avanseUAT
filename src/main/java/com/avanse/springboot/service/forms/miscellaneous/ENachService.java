package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.ENach;
import com.avanse.springboot.repository.forms.miscellaneous.EnachRespository;

@Service
public class ENachService {

	@Autowired
	EnachRespository eNachRepository;
	
	public List<ENach> getEnachDetails(){
		return eNachRepository.findAll();
	}
	
	public void addEnach(ENach eNach) {
		eNachRepository.save(eNach);
	}
	
	public long numberOfEnachEntries() {
		return eNachRepository.count();
	}
	
}
