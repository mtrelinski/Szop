package com.szop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController extends AbstractController {
	
	private static Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@RequestMapping("/product")
	public ModelAndView productAction() {
		
		ModelAndView mav = new ModelAndView("product/product");
		
		
		return mav;
	}
	
	@RequestMapping("/productsList")
	public ModelAndView productsListAction() {
		
		ModelAndView mav = new ModelAndView("product/productsList");
		
		
		return mav;
	}	
	
	@RequestMapping("/productsSearch")
	public ModelAndView productsSearchAction() {
		
		ModelAndView mav = new ModelAndView("product/productsSearch");
		
		
		return mav;
	}	
}