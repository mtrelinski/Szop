package com.szop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController extends AbstractController {

	private static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping("/index")
	public ModelAndView indexAction() {
		
		ModelAndView mav = new ModelAndView("index");
		
		System.out.println("--------------------------------> test test");
		
		String message = "Dupa index sklepu";
		
		mav.addObject("message", message);
		
		return mav;
	}
	
	
}