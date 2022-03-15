package com.avanse.springboot.service.forms.miscellaneous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.model.forms.miscellaneous.CrossSell;
import com.avanse.springboot.repository.forms.miscellaneous.CrossSellRepository;
@Service
public class CrossSellService {

	@Autowired
	CrossSellRepository crossSellRepository;
	
	public List<CrossSell>getCrossSellDetails(){
		return crossSellRepository.findAll();
	}
	
	public void addCrossSellLead(CrossSell crossSell) {
		crossSellRepository.save(crossSell);
	}
	
	public long numberofCrossSellEntries() {
		return crossSellRepository.count();
	}
	
	
}
