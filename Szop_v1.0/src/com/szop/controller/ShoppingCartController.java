package com.szop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoppingCartController extends AbstractController {

	private static Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);
	
	@RequestMapping("/shoppingCart")
	public ModelAndView shoppingCartAction() {
		
		ModelAndView mav = new ModelAndView("shoppingCart/shoppingCart");
		
		
		return mav;
	}
	
	@RequestMapping("/shoppingCart/addProduct")
	public ModelAndView addProductAction() {
		
		ModelAndView mav = new ModelAndView("shoppingCart/shoppingCart");
		
		
		return mav;
	}
	
	@RequestMapping("/shoppingCart/removeProduct")
	public ModelAndView removeProductAction() {
		
		ModelAndView mav = new ModelAndView("shoppingCart/shoppingCart");
		
		
		return mav;
	}
}