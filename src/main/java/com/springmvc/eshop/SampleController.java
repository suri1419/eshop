package com.springmvc.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("/greetings")
	public String greetings(Model model) {

		model.addAttribute("myVar", "Welcome to Spring MVC!");

		return "myPage";
	}

}
