package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.MoratoriumDeregister;
import com.avanse.springboot.repository.forms.miscellaneous.MoratoriumDeregisterRepository;

@Service
public class MoratoriumDeregisterService {

	@Autowired
	MoratoriumDeregisterRepository moratoriumDeregisterRepository;
	
	public List<MoratoriumDeregister> getMoratoriumDeregisterDetails(){
		return moratoriumDeregisterRepository.findAll();
	}
	
	public void addMoratariumDeregister(MoratoriumDeregister moratoriumDeregister) {
		moratoriumDeregisterRepository.save(moratoriumDeregister);
	}
	
}
