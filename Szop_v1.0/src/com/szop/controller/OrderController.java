package com.szop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController extends AbstractController {
	
	private static Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@RequestMapping("/order")
	public ModelAndView orderAction() {
		
		ModelAndView mav = new ModelAndView("order/order");
		
		
		return mav;
	}
	
	@RequestMapping("/order/confirm")
	public ModelAndView confirmOrderAction() {
		
		ModelAndView mav = new ModelAndView("order/confirm");
		
		
		return mav;
	}
	
	@RequestMapping("/order/finish")
	public ModelAndView finishOrderAction() {
		
		ModelAndView mav = new ModelAndView("order/finish");
		
		
		return mav;
	}

}