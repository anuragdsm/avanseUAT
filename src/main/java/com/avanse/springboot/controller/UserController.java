package com.avanse.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.avanse.springboot.repository.UserRepository;
import com.avanse.springboot.service.CustomUserDetailService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000/")
@Controller
//@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

	

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CustomUserDetailService customUserDetailService;
	
//	@RequestMapping("users")
//	public List<User>getUsers(){	
//		
////		Start appending the messages to the console
//		
////		log.addAppender(app);
//		log.debug("This is debug");
//		log.info("This is info");
//		log.error("This is error");
//		log.fatal("This is fatal");
//		log.warn("This is warn");
//		log.fatal("All was fine until this");
//
//		return this.userRepository.findAll();
//	}
	
	
	/*
	 * Code for just open the register page
	*/
	
	
//	@GetMapping("/register")
//	public String registerNewUser() {
//		return "register";
//	}
//	
//	/*
//	 * One the form is opened using the getmapping,
//	 * now we will use the post mapping to process the form
//	*/
//	
//	@PostMapping("/registerUser")
////	@ResponseBody
//	public String registerNewUserPost(@ModelAttribute("userDTO") UserDTO userDTO) {
//		
//		User user = new User();
//		
////		user.setId(userDTO.getId());
//		
//		
////		customUserDetailService.
//		return "index";
//	}
//	
	
	
	
	
}
