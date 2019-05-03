package com.springmvc.eshop.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.eshop.domain.EshopUser;
import com.springmvc.eshop.service.RegistrationService;

@Controller
public class RegistrationController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	private RegistrationService registrationService;

	// display the jsp page
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		EshopUser eshopUser = new EshopUser();
		model.addAttribute("eshopUser", eshopUser);
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postRegistration(@Valid EshopUser eshopUser,BindingResult bindingResult) {

		logger.info("user enterd data:"+eshopUser);
		if(bindingResult.hasErrors()) {
			logger.info("user didnt filled the entire form required...");
			return "register";
		}
		boolean result = registrationService.register(eshopUser);
		if (result)
			return "regSuccess";
		else
			return "register";
	}

}
