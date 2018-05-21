package com.szop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerRegistrationController extends AbstractController {
	
	private static Logger logger = LoggerFactory.getLogger(CustomerRegistrationController.class);

	@RequestMapping("/customerRegistration")
	public ModelAndView customerRegistrationAction() {
		
		ModelAndView mav = new ModelAndView("customerRegistration/customerRegistration");
		
		
		return mav;
	}
	
	@RequestMapping("/customerRegistration/confirm")
	public ModelAndView confirmAction() {
		
		ModelAndView mav = new ModelAndView("customerRegistration/confirm");
		
		
		return mav;
	}
	
	@RequestMapping("/customerRegistration/finish")
	public ModelAndView finishAction() {
		
		ModelAndView mav = new ModelAndView("customerRegistration/finish");
		
		
		return mav;
	}
}