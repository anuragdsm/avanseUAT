/*
 * This class is going to be a general controller to controll the page linking...
 * 
*/

package com.avanse.springboot.controller.globalPages;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.avanse.springboot.DTO.forms.applyNow.ApplyNowGeneralDTO;
import com.avanse.springboot.DTO.forms.applyNow.ETutoringDTO;
import com.avanse.springboot.DTO.forms.applyNow.EducationInstitutionLoanDTO;
import com.avanse.springboot.DTO.forms.applyNow.ExecutiveEducationLoanDTO;
import com.avanse.springboot.DTO.forms.applyNow.PartnerWithUsDTO;
import com.avanse.springboot.DTO.forms.applyNow.SchoolFeeFinancingDTO;
import com.avanse.springboot.DTO.forms.applyNow.SkillEnhancementDTO;
import com.avanse.springboot.DTO.forms.contactUs.CustomerDTO;
import com.avanse.springboot.DTO.forms.contactUs.InstituteDTO;
import com.avanse.springboot.DTO.forms.contactUs.InvestorDTO;
import com.avanse.springboot.DTO.forms.contactUs.MediaDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.AssociateWithUsDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.CSRLeadsDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.ENachDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.MoratoriumDeregisterDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.MoratoriumFacilityDTO;
import com.avanse.springboot.DTO.forms.miscellaneous.RestructuringOfLoansDTO;
import com.avanse.springboot.model.Page;
import com.avanse.springboot.model.Post;
import com.avanse.springboot.model.PostCategory;
import com.avanse.springboot.service.AwardService;
import com.avanse.springboot.service.CourseService;
import com.avanse.springboot.service.PageService;
import com.avanse.springboot.service.PostCategoryService;
import com.avanse.springboot.service.PostService;
import com.avanse.springboot.service.TestimonialService;
import com.avanse.springboot.service.UniversityService;

@Controller

public class PageController {
	
	@Autowired
	PageService pageService;
	
	@Autowired
	PostCategoryService postCategoryService;
	
	@Autowired
	PostService postService;
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	UniversityService universityService;
	
	@Autowired
	AwardService awardService;
	
	@Autowired
	TestimonialService testimonialService;
	
	
	@GetMapping(value={"/index","/"})
	public String homePage(Model model) {
		model.addAttribute("awards", awardService.getAllAwards() );
		model.addAttribute("testimonials", testimonialService.getAllTestimonials());
		return "dynamicPages/index";
	}
	@GetMapping(value={"/study-abroad"})
	public String studyAbroadPage(Model model) {
		return "dynamicPages/study-abroad";
	}
	@GetMapping(value={"/education-loan/study-india-loan"})
	public String studyInIndiaPage(Model model) {
		model.addAttribute("testimonials", testimonialService.getAllTestimonials());

		return "dynamicPages/study-in-india";
	}
	
	@GetMapping(value={"/education-loan-for-mba"})
	public String educationLoanForMbaPage(Model model) {
		model.addAttribute("testimonials", testimonialService.getAllTestimonials());
		
		return "dynamicPages/education-loan-for-mba";
	}
	

	@GetMapping("/about-avanse/career")
	public String careerPage() {
		return "dynamicPages/career";
	}
	@GetMapping("/career/apply")
	public String jobApplyPage() {
		return "dynamicPages/career";
	}
	@GetMapping("/education-loan/eligibility-calculator1")
	public String educationLoanEligibilityCalculatorPage() {
		return "dynamicPages/calculatorPages/education-loan-eligibility-calculator";
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		return "about";
	}

	@GetMapping("/testimonials")
	public String testimonialsPage(Model model) {
		model.addAttribute("testimonials", testimonialService.getAllTestimonials());
		return "dynamicPages/testimonials";
	}
		
	@GetMapping("/courseDetail/{courseId}")
	public String courseDetailsPage(@PathVariable long courseId, Model model) {
		model.addAttribute("course", courseService.getCourseById(courseId).get());
		return "dynamicPages/courseDetail";
	}
	
	@GetMapping("/UID/{universityId}")
	public String universityDetailsPage(@PathVariable long universityId, Model model) {
		model.addAttribute("university", universityService.getUniversityById(universityId).get());
		return "dynamicPages/university";
	}
	
	
	  @GetMapping(value =
	  {"/Country/{country}","/Country/{country}/{courseId}","/Country/{country}/UID={universityId}",
	  "/Country/{country}/{courseId}/{universityId}"}) public String
	  countryPage(@PathVariable("country") String countryName, Model model,
	  @PathVariable(name = "courseId",required = false) Long courseId,
	  @PathVariable(name = "universityId",required = false) Long universityId) {
	  
	  System.out.println("Testing Country --- > "+countryName);
	  System.out.println("Testing CourseId --- > "+courseId);
	  System.out.println("Testing UniversityID --- > "+universityId);
	  
	  if(courseId!=null) {
		  model.addAttribute("courseIdCheck", "courseIdIsPresent");
		  model.addAttribute("incomingCourseModel", courseService.getCourseById(courseId).get());
	  }
	  if(universityId!=null) {
		  model.addAttribute("universityIdCheck", "universityIdIsPresent");
		  model.addAttribute("incomingUniversityModel", universityService.getUniversityById(universityId).get());
	  }
	  
	  return "dynamicPages/"+countryName; 
	  }
	 
	@GetMapping("/admin/viewPages/{extractedFileName}")
	public ModelAndView getAddedPage(@PathVariable("extractedFileName") String extractedFileName) {
		ModelAndView modelAndView = new ModelAndView("addedPages/"+extractedFileName);	
		return modelAndView;		
	}
	
	@GetMapping("/blog")
	public ModelAndView getBlogPage(Model model, 
			@RequestParam(value = "searchKey",required = false) String searchKey) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/blog");
		System.out.println("testing.........searchkey : "+searchKey);
		model.addAttribute("postCategories", postCategoryService.getAllPostCategories());
		model.addAttribute("posts", postService.getTopFourLatestPosts());
		model.addAttribute("searchKey", searchKey);
		return modelAndView;
	}
	
	@GetMapping("/contact-us")
	public ModelAndView getContactUsCustomer(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/contactus");
		model.addAttribute("customerDTO", new CustomerDTO());
		model.addAttribute("instituteDTO", new InstituteDTO());
		model.addAttribute("investorDTO", new InvestorDTO());
		model.addAttribute("mediaDTO", new MediaDTO());
		return modelAndView;
	}
	
	  @GetMapping("/apply-now") 
	  public ModelAndView getApplyNowForm(Model model) {
	  ModelAndView modelAndView = new ModelAndView("dynamicPages/apply-now");
	  model.addAttribute("applyNowGeneralDTO", new ApplyNowGeneralDTO()); 
		model.addAttribute("awards", awardService.getAllAwards() );

	  return modelAndView;  
	  }
	 
	@GetMapping("/apply-for-education-institution-loan")
	public ModelAndView getEducationInstitutionLoan(Model model) {
		ModelAndView modelAndView =  new ModelAndView("dynamicPages/education-institution-loan");
		model.addAttribute("educationInstitutionLoanDTO", new EducationInstitutionLoanDTO());
		model.addAttribute("awards", awardService.getAllAwards() );

		return modelAndView;	
	}
	
	@GetMapping("/apply-for-executive-education-loan")
	public ModelAndView getExecutiveEducationLoan(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/executive-education-loan");
		model.addAttribute("executiveEducationLoanDTO", new ExecutiveEducationLoanDTO());

		model.addAttribute("awards", awardService.getAllAwards() );

		return modelAndView;
	}
	
	@GetMapping("/apply-for-e-tutoring")
	public ModelAndView getApplyForEtutoringPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/apply-for-e-tutoring");
		model.addAttribute("eTutoringDTO", new ETutoringDTO());
		model.addAttribute("awards", awardService.getAllAwards());
		return modelAndView;
	}
	
	
	@GetMapping("/apply-for-partner-with-us")
	public ModelAndView getPartnerWithUsPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/apply-for-partner-with-us");
		model.addAttribute("partnerWithUsDTO", new PartnerWithUsDTO());
		model.addAttribute("awards", awardService.getAllAwards() );

		return modelAndView;
	}
	
	@GetMapping("/apply-for-school-fee-financing")
	public ModelAndView getSchoolFeeFinancingPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/apply-for-school-fee-financing");
		model.addAttribute("schoolFeeFinancingDTO", new SchoolFeeFinancingDTO());
		model.addAttribute("awards", awardService.getAllAwards() );

		return modelAndView;
	}
	
	@GetMapping("/apply-for-skill-enhancement")
	public ModelAndView getApplyForSkillEnhancementPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/apply-for-skill-enhancement");
		model.addAttribute("skillEnhancementDTO", new SkillEnhancementDTO());
		model.addAttribute("awards", awardService.getAllAwards() );

		return modelAndView;
	}
	
	@GetMapping("/about-avanse/associate-with-us")
	public ModelAndView getAssociateWithUsPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/associate-with-us");
		model.addAttribute("associateWithUsDTO", new AssociateWithUsDTO());
		return modelAndView;
	}
	
	@GetMapping("/corporatesocialresponsibility")
	public ModelAndView getCSRPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/csr");
		model.addAttribute("csrLeadsDTO", new CSRLeadsDTO());
		return modelAndView;
	}
	@GetMapping("/e-nach")
	public ModelAndView getENachPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/e-nach");
		model.addAttribute("eNachDTO", new ENachDTO());
		return modelAndView;
	}

	@GetMapping("/restructuring-of-loans-step1")
	public ModelAndView getRestructuringOfLoansPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/restructuring-of-loans");
		model.addAttribute("restructuringOfLoansDTO", new RestructuringOfLoansDTO());
		return modelAndView;
	}
	
	@GetMapping("/moratorium-facility-2020")
	public ModelAndView getMoratoriumFacilityPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/moratorium-facility-2020");
		model.addAttribute("moratoriumFacilityDTO", new MoratoriumFacilityDTO());
		return modelAndView;
	}

	@GetMapping("/moratorium-facility-deregister")
	public ModelAndView getMoratoriumFacilityDeregisterPage(Model model) {
		ModelAndView modelAndView = new ModelAndView("dynamicPages/moratorium-facility-deregister");
		model.addAttribute("moratoriumDeregisterDTO", new MoratoriumDeregisterDTO());
		return modelAndView;
	}
	
	/*
	 * Page for all forms
	*/
	
}
