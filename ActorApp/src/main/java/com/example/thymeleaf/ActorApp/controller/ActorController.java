package com.example.thymeleaf.ActorApp.controller;

import java.util.HashMap;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.thymeleaf.ActorApp.repository.ActorRepository;

@Controller
public class ActorController {
	
	 private static final Logger logger = LoggerFactory.getLogger(ActorController.class);
	 @Autowired
	 private ActorRepository actorRepository;
	    @RequestMapping(path = { "/ActorList" }, method = RequestMethod.GET)
	    public String showHome(Model m) {
	        logger.debug("in showHome");

	        m.addAttribute("messages", actorRepository.findAll());
	        return "ActorList";
	    }

}
