package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.MoratoriumFacility;
import com.avanse.springboot.repository.forms.miscellaneous.MoratoriumFacilityRepository;

@Service
public class MoratoriumFacilityService {

	@Autowired
	MoratoriumFacilityRepository moratoriumFacilityRepository;
	
	public List<MoratoriumFacility> getMoratoriumFacilityDetails(){
		return moratoriumFacilityRepository.findAll();
	}
	
	public void addMoratoriumFacility(MoratoriumFacility moratoriumFacility) {
		moratoriumFacilityRepository.save(moratoriumFacility);
	}
}
