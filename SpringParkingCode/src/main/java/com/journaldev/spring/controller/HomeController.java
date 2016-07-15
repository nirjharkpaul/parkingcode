package com.journaldev.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author 212568587
 * 
 * this controller handles the home 
 * page navigation for the application
 */


@Controller
public class HomeController {

	/***
	 * static logger reference 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	
	/***
	 * this is the home page of the application 
	 */
	private final String HOME_PAGE="upload";
	
	/**
	 * this is controller method which will return 
	 * the home page of the application
	 * 
	 * demo purpose only
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String navigateToHomePage()
	{
		logger.info("Navigating to home page : "+HOME_PAGE);
		return HOME_PAGE;
	}
	
}
