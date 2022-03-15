package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.MoratoriumEilLead;
import com.avanse.springboot.repository.forms.miscellaneous.MoratoriumEILRepository;

@Service
public class MoratoriumEilService {

	@Autowired
	MoratoriumEILRepository moratoriumEILRepository;
	
	public List<MoratoriumEilLead> getAllMoratoriumEILLeads(){
		return moratoriumEILRepository.findAll();
	}
	
	public void addMoratoriumEILLead(MoratoriumEilLead moratoriumEilLead) {
		moratoriumEILRepository.save(moratoriumEilLead);
	}
	
	public long numberOfMoratoriumEilLead() {
		return moratoriumEILRepository.count();
	}
	
	
}
