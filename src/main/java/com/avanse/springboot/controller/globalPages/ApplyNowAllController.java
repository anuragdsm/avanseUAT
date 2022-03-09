package com.avanse.springboot.controller.globalPages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avanse.springboot.DTO.UniversityDTO;
import com.avanse.springboot.DTO.forms.applyNow.ApplyNowGeneralDTO;
import com.avanse.springboot.DTO.forms.applyNow.ETutoringDTO;
import com.avanse.springboot.DTO.forms.applyNow.EducationInstitutionLoanDTO;
import com.avanse.springboot.DTO.forms.applyNow.ExecutiveEducationLoanDTO;
import com.avanse.springboot.DTO.forms.applyNow.PartnerWithUsDTO;
import com.avanse.springboot.DTO.forms.applyNow.SchoolFeeFinancingDTO;
import com.avanse.springboot.DTO.forms.applyNow.SkillEnhancementDTO;
import com.avanse.springboot.model.forms.applyNow.ApplyNowGeneral;
import com.avanse.springboot.model.forms.applyNow.ETutoring;
import com.avanse.springboot.model.forms.applyNow.EducationInstitutionLoan;
import com.avanse.springboot.model.forms.applyNow.ExecutiveEducationLoan;
import com.avanse.springboot.model.forms.applyNow.PartnerWithUs;
import com.avanse.springboot.model.forms.applyNow.SchoolFeeFinancing;
import com.avanse.springboot.model.forms.applyNow.SkillEnhancement;
import com.avanse.springboot.service.applyNow.ApplyNowGeneralService;
import com.avanse.springboot.service.applyNow.ETutoringService;
import com.avanse.springboot.service.applyNow.EducationInstitutionLoanService;
import com.avanse.springboot.service.applyNow.ExecutiveEducationLoanService;
import com.avanse.springboot.service.applyNow.PartnerWithUsService;
import com.avanse.springboot.service.applyNow.SchoolFeeFinancingService;
import com.avanse.springboot.service.applyNow.SkillEnhancementService;

@Controller
public class ApplyNowAllController {

	@Autowired
	ApplyNowGeneralService applyNowGeneralService;
	
	@Autowired
	ExecutiveEducationLoanService executiveEducationLoanService;
	
	@Autowired
	EducationInstitutionLoanService educationInstitutionLoanService;
	
	@Autowired
	ETutoringService eTutoringService;
	
	@Autowired
	PartnerWithUsService partnerWithUsService;
	
	@Autowired
	SchoolFeeFinancingService schoolFeeFinancingService;
	
	@Autowired
	SkillEnhancementService skillEnhancementService;
	
	
	

	@PostMapping("/apply-now/thankyou")
	public String applyNowGeneralAddPost(@ModelAttribute("applyNowGeneralDTO") ApplyNowGeneralDTO applyNowGeneralDTO) {
		ApplyNowGeneral applyNowGeneral = new ApplyNowGeneral();
		applyNowGeneral.setName(applyNowGeneralDTO.getName());
		applyNowGeneral.setCity(applyNowGeneralDTO.getCity());
		applyNowGeneral.setEmailId(applyNowGeneralDTO.getEmailId());
		applyNowGeneral.setContactNumber(applyNowGeneralDTO.getContactNumber());
		applyNowGeneral.setPlaceOfStudy(applyNowGeneralDTO.getPlaceOfStudy());
		applyNowGeneral.setLoanAmount(applyNowGeneralDTO.getLoanAmount());
		applyNowGeneral.setAdmissionStatus(applyNowGeneralDTO.getAdmissionStatus());
		applyNowGeneral.setPermission(applyNowGeneralDTO.getPermission());
		applyNowGeneral.setTimeOfStudy(applyNowGeneralDTO.getTimeOfStudy());
		applyNowGeneralService.addApplyNowGeneral(applyNowGeneral);
		
		return "dynamicPages/thankyou";
	}
	
	
	@PostMapping("/apply-for-e-tutoring/thankyou")
	public String eTutoringAddPost(@ModelAttribute("eTutoringDTO") ETutoringDTO eTutoringDTO) {
		ETutoring eTutoring = new ETutoring();
		eTutoring.setFirstName(eTutoringDTO.getFirstName());
		eTutoring.setLastName(eTutoringDTO.getLastName());
		eTutoring.setCity(eTutoringDTO.getCity());
		eTutoring.setCourseName(eTutoringDTO.getCourseName());
		eTutoring.setCourseProvider(eTutoringDTO.getCourseProvider());
		eTutoring.setEmail(eTutoringDTO.getEmail());
		eTutoring.setLoanAmount(eTutoringDTO.getLoanAmount());
		eTutoring.setPhoneNumber(eTutoringDTO.getPhoneNumber());
		eTutoringService.addETutoring(eTutoring);
		
		return "dynamicPages/thankyou";
	}
	
	@PostMapping("/executive-education-loan/thankyou")
	public String executiveEducationLoanAddPost(@ModelAttribute("executiveEducationLoanDTO") ExecutiveEducationLoanDTO executiveEducationLoanDTO) {
		ExecutiveEducationLoan executiveEducationLoan = new ExecutiveEducationLoan();
		executiveEducationLoan.setFirstName(executiveEducationLoanDTO.getFirstName());
		executiveEducationLoan.setLastName(executiveEducationLoanDTO.getLastName());
		executiveEducationLoan.setEmail(executiveEducationLoanDTO.getEmail());
		executiveEducationLoan.setPhoneNumber(executiveEducationLoanDTO.getPhoneNumber());
		executiveEducationLoan.setCourseName(executiveEducationLoanDTO.getCourseName());
		executiveEducationLoan.setLoanAmount(executiveEducationLoanDTO.getLoanAmount());
		executiveEducationLoanService.addExecutiveEducationLoan(executiveEducationLoan);
		return "dynamicPages/thankyou";
	}
	@PostMapping("/education-institution-loan/thankyou")
	public String educationInstitutionLoanAddPost(@ModelAttribute("educationInstitutionLoanDTO") EducationInstitutionLoanDTO educationInstitutionLoanDTO) {
		EducationInstitutionLoan educationInstitutionLoan= new EducationInstitutionLoan();
		educationInstitutionLoan.setFirstName(educationInstitutionLoanDTO.getFirstName());
		educationInstitutionLoan.setLastName(educationInstitutionLoanDTO.getLastName());
		educationInstitutionLoan.setPhoneNumber(educationInstitutionLoanDTO.getPhoneNumber());
		educationInstitutionLoan.setEmail(educationInstitutionLoanDTO.getEmail());
		educationInstitutionLoan.setCity(educationInstitutionLoanDTO.getCity());
		educationInstitutionLoan.setLoanType(educationInstitutionLoanDTO.getLoanType());
		educationInstitutionLoan.setLoanAmount(educationInstitutionLoanDTO.getLoanAmount());
		educationInstitutionLoan.setLoanUsage(educationInstitutionLoanDTO.getLoanUsage());
		educationInstitutionLoan.setInstitutionType(educationInstitutionLoanDTO.getInstitutionType());
		educationInstitutionLoan.setCurriculumBoard(educationInstitutionLoanDTO.getCurriculumBoard());
		educationInstitutionLoan.setVintage(educationInstitutionLoanDTO.getVintage());
		educationInstitutionLoan.setStudentStrength(educationInstitutionLoanDTO.getStudentStrength());
		educationInstitutionLoanService.addEducationInstitutionLoan(educationInstitutionLoan);
		
//		executiveEducationLoanService.addExecutiveEducationLoan(executiveEducationLoan);
		return "dynamicPages/thankyou";
	}
	
	
	@PostMapping("/apply-for-partner-with-us/thankyou")
	public String partnerWithUssAddPost(@ModelAttribute("partnerWithUsDTO") PartnerWithUsDTO partnerWithUsDTO) {
		
		PartnerWithUs partnerWithUs = new PartnerWithUs();
		partnerWithUs.setFirstName(partnerWithUsDTO.getFirstName());
		partnerWithUs.setLastName(partnerWithUsDTO.getLastName());
		partnerWithUs.setEmail(partnerWithUsDTO.getEmail());
		partnerWithUs.setCity(partnerWithUsDTO.getCity());
		partnerWithUs.setMobileNumber(partnerWithUsDTO.getMobileNumber());
		partnerWithUs.setNameOfFirm(partnerWithUsDTO.getNameOfFirm());
		partnerWithUs.setPartnerType(partnerWithUsDTO.getPartnerType());
		
		partnerWithUsService.addPartnerWithUsLead(partnerWithUs);
		return "dynamicPages/thankyou";
		
	}
	
	@PostMapping("/apply-for-school-fee-financing/thankyou")
	public String schoolFeeFinaningAddPost(@ModelAttribute("schoolFeeFinancingDTO") SchoolFeeFinancingDTO schoolFeeFinancingDTO ) {
		SchoolFeeFinancing schoolFeeFinancing = new SchoolFeeFinancing();
		schoolFeeFinancing.setFirstName(schoolFeeFinancingDTO.getFirstName());
		schoolFeeFinancing.setLastName(schoolFeeFinancingDTO.getLastName());
		schoolFeeFinancing.setCity(schoolFeeFinancingDTO.getCity());
		schoolFeeFinancing.setEmail(schoolFeeFinancingDTO.getEmail());
		schoolFeeFinancing.setLoanAmount(schoolFeeFinancingDTO.getLoanAmount());
		schoolFeeFinancing.setPhoneNumber(schoolFeeFinancingDTO.getPhoneNumber());
		schoolFeeFinancing.setNameOfTheSchool(schoolFeeFinancingDTO.getNameOfTheSchool());
		schoolFeeFinancingService.addSchoolFeeFinancingLead(schoolFeeFinancing);
		return "dynamicPages/thankyou";
		
	}
	
	@PostMapping("/apply-for-skill-enhancement/thankyou")
	public String skillEnhancementAddPost(@ModelAttribute("skillEnhancementDTO") SkillEnhancementDTO skillEnhancementDTO) {
		SkillEnhancement skillEnhancement = new SkillEnhancement();
		skillEnhancement.setCity(skillEnhancementDTO.getCity());
		skillEnhancement.setCourseName(skillEnhancementDTO.getCourseName());
		skillEnhancement.setCourseProvider(skillEnhancementDTO.getCourseProvider());
		skillEnhancement.setEmail(skillEnhancementDTO.getEmail());
		skillEnhancement.setFirstName(skillEnhancementDTO.getFirstName());
		skillEnhancement.setLastName(skillEnhancementDTO.getLastName());
		skillEnhancement.setLoanAmount(skillEnhancementDTO.getLoanAmount());
		skillEnhancement.setPhoneNumber(skillEnhancementDTO.getPhoneNumber());
		skillEnhancementService.addSkillEnhancement(skillEnhancement);
		return "dynamicPages/thankyou";
		
	}
	
	/*
	 * For admin data display
	*/
	
	@GetMapping("/admin/apply-now/general")
	public String applyNowGeneralGet(Model model) {
		model.addAttribute("applyNowGeneralLeads", applyNowGeneralService.getAllApplyNowGeneralLeads());
//		model.addAttribute("university", new University());
		return "apply-now-general";
	} 
	
	
	@GetMapping("/admin/apply-now/e-tutoring")
	public String applyNowETutoringGet(Model model) {
		model.addAttribute("eTutoringLeads", eTutoringService.getAllETutoringLeads());
//		model.addAttribute("university", new University());
		return "apply-now-e-Tutoring";
	} 
	@GetMapping("/admin/apply-now/partner-with-us")
	public String applyNowPartnerWithUsGet(Model model) {
		model.addAttribute("partnerWithUsLeads",  partnerWithUsService.getPartnerWithUsLeads());
//		model.addAttribute("university", new University());
		return "apply-now-partner-with-us";
	} 
	
	@GetMapping("/admin/apply-now/school-fee-financing")
	public String applyNowSchoolFeeFinancingGet(Model model) {
		model.addAttribute("schoolFeeFinancingLeads",  schoolFeeFinancingService.getSchoolFeeFinancingLeads());
//		model.addAttribute("university", new University());
		return "apply-now-school-fee-financing";
	} 
	
	
	@GetMapping("/admin/apply-now/skill-enhancement")
	public String applyNowSkillEnhancementGet(Model model) {
		model.addAttribute("skillEnhancementLeads",  skillEnhancementService.getAllSkillEnhancementsLeads());
		return "apply-now-skill-enhancement";
	} 
	
	
	@GetMapping("/admin/apply-now/education-institution-loan")
	public String applyNowEducationInstitutionLoanGet(Model model) {
		model.addAttribute("educationInstitutionLoanLeads",  educationInstitutionLoanService.getAllEducationInstitutionLoanLeads());
		return "apply-now-education-institution-loan";
	} 
	@GetMapping("/admin/apply-now/executive-education-loan")
	public String applyNowExecutiveEducationLoanGet(Model model) {
		model.addAttribute("executiveEducationLoanLeads", executiveEducationLoanService.getAllExecutiveEducationLoanLeads());
		return "apply-now-executive-education-loan";
	} 
	
	

	
}
