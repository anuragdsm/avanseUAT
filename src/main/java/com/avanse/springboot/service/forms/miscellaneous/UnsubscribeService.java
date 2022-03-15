package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.Unsubscribe;
import com.avanse.springboot.repository.forms.miscellaneous.UnsubscribeRepository;

@Service
public class UnsubscribeService {

	@Autowired
	UnsubscribeRepository unsubscribeRepository;
	
	public List<Unsubscribe> getUnsubscribeList(){
		return unsubscribeRepository.findAll();
	}
	
	public void addToUnsubscribeList(Unsubscribe unsubscribe) {
		unsubscribeRepository.save(unsubscribe);
	}
	
	
}
