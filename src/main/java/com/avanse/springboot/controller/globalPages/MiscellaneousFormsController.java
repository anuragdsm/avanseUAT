package com.avanse.springboot.controller.globalPages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.avanse.springboot.DTO.forms.miscellaneous.AssociateWithUsDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.CSRLeadsDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.ENachDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.MoratoriumDeregisterDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.MoratoriumFacilityDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.RestructuringOfLoansDTO;
import com.avanse.springboot.model.forms.miscellaneous.AssociateWithUs;
import com.avanse.springboot.model.forms.miscellaneous.CSRLeads;
import com.avanse.springboot.model.forms.miscellaneous.ENach;
import com.avanse.springboot.model.forms.miscellaneous.MoratoriumDeregister;
import com.avanse.springboot.model.forms.miscellaneous.MoratoriumFacility;
import com.avanse.springboot.model.forms.miscellaneous.RestructuringOfLoans;
import com.avanse.springboot.service.forms.miscellaneous.AssociateWithUsService;
import com.avanse.springboot.service.forms.miscellaneous.CSRLeadsService;
import com.avanse.springboot.service.forms.miscellaneous.ENachService;
import com.avanse.springboot.service.forms.miscellaneous.MoratoriumDeregisterService;
import com.avanse.springboot.service.forms.miscellaneous.MoratoriumFacilityService;
import com.avanse.springboot.service.forms.miscellaneous.RestructuringOfLoansService;

@Controller
public class MiscellaneousFormsController {
	
	@Autowired
	AssociateWithUsService associateWithUsService;
	
	@Autowired
	CSRLeadsService csrLeadsService;

	@Autowired
	ENachService eNachService;
	
	@Autowired
	RestructuringOfLoansService restructuringOfLoansService;
	
	@Autowired
	MoratoriumFacilityService moratoriumFacilityService ;
	
	@Autowired
	MoratoriumDeregisterService moratoriumDeregisterService;
	
	@PostMapping("/associate-with-us/thankyou")
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
	
	@PostMapping("/corporatesocialresponsibility/thankyou")
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
	
	@PostMapping("/e-nach/thankyou")
	public String eNachPost(@ModelAttribute("eNachDTO") ENachDTO eNachDTO) {
		ENach eNach = new ENach();
		eNach.setDateOfBirthOrIncorporation(eNachDTO.getDateOfBirthOrIncorporation());
		eNach.setEmail(eNachDTO.getEmail());
		eNach.setLoanAccountNumber(eNachDTO.getLoanAccountNumber().toUpperCase());
		eNach.setMobileNumber(eNachDTO.getMobileNumber());
		eNach.setPanNumber(eNachDTO.getPanNumber().toUpperCase());
		eNachService.addEnach(eNach);
		return "dynamicPages/thankyou";
	}
	
	@PostMapping("/restructuring-of-loans-step/thankyou")
	public String restructuringOfLoansPost(@ModelAttribute("restructuringOfLoansDTO") RestructuringOfLoansDTO restructuringOfLoansDTO ) {
		RestructuringOfLoans restructuringOfLoans = new RestructuringOfLoans();
		restructuringOfLoans.setDateOfBirthOrIncorporation(restructuringOfLoansDTO.getDateOfBirthOrIncorporation());
		restructuringOfLoans.setEmail(restructuringOfLoansDTO.getEmail());
		restructuringOfLoans.setLoanAccountNumber(restructuringOfLoansDTO.getLoanAccountNumber().toUpperCase());
		restructuringOfLoans.setMobileNumber(restructuringOfLoansDTO.getMobileNumber());
		restructuringOfLoans.setPanNumber(restructuringOfLoansDTO.getPanNumber().toUpperCase());
		restructuringOfLoansService.addRestructuringOfLoans(restructuringOfLoans);
		return "dynamicPages/thankyou";
	}
	
	@PostMapping("/moratorium-facility-2020/thankyou")
	public String MoratoriumFacilityPost(@ModelAttribute("moratoriumFacilityDTO") MoratoriumFacilityDTO moratoriumFacilityDTO ) {
		MoratoriumFacility moratoriumFacility = new MoratoriumFacility();
		moratoriumFacility.setAlternateMobileNumber(moratoriumFacilityDTO.getAlternateMobileNumber());
		moratoriumFacility.setDateOfBirthOrIncorporation(moratoriumFacilityDTO.getDateOfBirthOrIncorporation());
		moratoriumFacility.setLoanAccountNumber(moratoriumFacilityDTO.getLoanAccountNumber());
		moratoriumFacility.setPanNumber(moratoriumFacilityDTO.getPanNumber());
		moratoriumFacilityService.addMoratoriumFacility(moratoriumFacility);
		return "dynamicPages/thankyou";
	}
	
	@PostMapping("/moratorium-facility-deregister/thankyou")
	public String moratoriumFacilityDeregister(@ModelAttribute("moratoriumDeregisterDTO") MoratoriumDeregisterDTO moratoriumDeregisterDTO ) {
		MoratoriumDeregister moratoriumDeregister = new MoratoriumDeregister();
		moratoriumDeregister.setAlternateNumber(moratoriumDeregisterDTO.getAlternateNumber());
		moratoriumDeregister.setDateOfBirthOrIncorporation(moratoriumDeregisterDTO.getDateOfBirthOrIncorporation());
		moratoriumDeregister.setEmail(moratoriumDeregisterDTO.getEmail());
		moratoriumDeregister.setLoanAccountNumber(moratoriumDeregisterDTO.getLoanAccountNumber());
		moratoriumDeregister.setMobileNumber(moratoriumDeregisterDTO.getMobileNumber());
		moratoriumDeregister.setName(moratoriumDeregisterDTO.getName());
		moratoriumDeregisterService.addMoratariumDeregister(moratoriumDeregister);
		return "dynamicPages/thankyou";
	}
	
	@GetMapping("/admin/miscellaneous-forms/associate-with-us")
	public String associateWithUsAdminGet(Model model) {
		model.addAttribute("associateWithUsLeads", associateWithUsService.getAssociateWithUsLeads());
		return "associate-with-us-leads";
	} 
	
	@GetMapping("/admin/miscellaneous-forms/csr")
	public String csrAdminGet(Model model) {
		model.addAttribute("csrLeads", csrLeadsService.getCSRLeads());
		return "csr-leads";
	} 
	
	
//	here is copy
	
	
	@GetMapping("/admin/miscellaneous-forms/e-nach")
	public String eNachAdminGet(Model model) {
		model.addAttribute("eNachDetails", eNachService.getEnachDetails());
		return "eNach-details";
	} 
	
	@GetMapping("/admin/miscellaneous-forms/restructuring-of-loans-step")
	public String restructuringOfLoansAdminGet(Model model) {
		model.addAttribute("restructuringOfLoansDetails", restructuringOfLoansService.getRestructuringOfLoanDetails());
		return "restructuring-of-loans-details";
	} 
	
	@GetMapping("/admin/miscellaneous-forms/moratorium-facility-2020")
	public String moratoriaumFacilityAdminGet(Model model) {
		model.addAttribute("moratoriumFacilityDetails", moratoriumFacilityService.getMoratoriumFacilityDetails());
		return "moratorium-facility-2020-details";
	} 
	
	@GetMapping("/admin/miscellaneous-forms/moratorium-facility-deregister")
	public String moratoriumFacilityDeregisterAdminGet(Model model) {
		model.addAttribute("moratoriumFacilityDeregisterDetails", moratoriumDeregisterService.getMoratoriumDeregisterDetails());
		return "moratorium-facility-deregister-details";
	} 
}
