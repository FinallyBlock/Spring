package com.example.thymeleaf.ActorApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MovieController {
	 private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

	    @RequestMapping(path = { "/HomePage" }, method = RequestMethod.GET)
	    public String showHome() {
	        logger.debug("in showHome");

	        return "MovieHome";
	    }
}
