package com.cogent.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class SecurityController {
	
	@RequestMapping("/")   //default end point
	public ModelAndView defaultHome() {
		return new ModelAndView("home"); //JSP home.jsp
	}

}
