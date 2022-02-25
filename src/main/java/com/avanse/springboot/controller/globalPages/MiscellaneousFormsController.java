package com.avanse.springboot.controller.globalPages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.avanse.springboot.DTO.forms.miscellaneous.AssociateWithUsDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.CSRLeadsDTO;
import com.avanse.springboot.model.forms.miscellaneous.AssociateWithUs;
import com.avanse.springboot.model.forms.miscellaneous.CSRLeads;
import com.avanse.springboot.service.forms.miscellaneous.AssociateWithUsService;
import com.avanse.springboot.service.forms.miscellaneous.CSRLeadsService;

@Controller
public class MiscellaneousFormsController {
	
	@Autowired
	AssociateWithUsService associateWithUsService;
	
	@Autowired
	CSRLeadsService csrLeadsService;
	
	
	@PostMapping("/associate-with-us/add")
	public String associateWithUsPost(@ModelAttribute("associateWithUsDTO") AssociateWithUsDTO associateWithUsDTO ) {
		AssociateWithUs associateWithUs = new AssociateWithUs();
		associateWithUs.setCity(associateWithUsDTO.getCity());
		associateWithUs.setContactNumber(associateWithUsDTO.getContactNumber());
		associateWithUs.setEmail(associateWithUsDTO.getEmail());
		associateWithUs.setName(associateWithUsDTO.getName());
		associateWithUs.setPartnershipType(associateWithUsDTO.getPartnershipType());
		associateWithUsService.addAssociateWithUsLead(associateWithUs);
		return "dynamicPages/thankyou";
		
	}
	@PostMapping("/csr/add")
	public String csrPost(@ModelAttribute("csrLeadsDTO") CSRLeadsDTO csrLeadsDTO) {
		CSRLeads csrLeads = new CSRLeads();
		csrLeads.setContactNumber(csrLeadsDTO.getContactNumber());
		csrLeads.setEmail(csrLeadsDTO.getEmail());
		csrLeads.setMessage(csrLeadsDTO.getMessage());
		csrLeads.setName(csrLeadsDTO.getName());
		csrLeads.setSubject(csrLeadsDTO.getSubject());
		csrLeadsService.addCSRLead(csrLeads);
				
		return "dynamicPages/thankyou";
		
	}
	

	
}
