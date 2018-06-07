package com.example.thymeleaf.ActorApp.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thymeleaf.ActorApp.bean.Film;
import com.example.thymeleaf.ActorApp.bean.Film_text;
import com.example.thymeleaf.ActorApp.repository.FilmRepository;
import com.example.thymeleaf.ActorApp.repository.FilmTextRepository;


@Controller
public class FilmController {
	 private static final Logger logger = LoggerFactory.getLogger(ActorController.class);
	 @Autowired
	 private FilmRepository filmRepository;
	 @Autowired
	 private FilmTextRepository filmTextRepository;
	    @RequestMapping(path = { "/FilmList" }, method = RequestMethod.GET)
	    public String showHome(Model m) {
	        logger.debug("in showHome");

	        m.addAttribute("messages", filmRepository.findAll());
	        return "FilmList";
	    }
	    
	    @RequestMapping(path = { "/MyFilm" }, method = RequestMethod.POST)
	    public String showMovie(@RequestParam("id") int id,Model m) {
	        logger.debug("in showHome");
	        System.out.println("aasd"+id);
	        int id1=id;
	        m.addAttribute("film", filmRepository.findByAnId(id1));
	        return "myMovie";

	    }
	    
	    @RequestMapping(path = { "/addMovie" }, method = RequestMethod.GET)
	    public String addMovie() {
	        logger.debug("in showHome");

	        return "addMovie";

	    }
	    
	    @RequestMapping(path = { "/addMovies" }, method = RequestMethod.POST)
	    public String postMovie(@RequestParam("title") String title,@RequestParam("description") String description,String film_id, Model m) {
	        logger.debug("in showHome");
	        System.out.println("aasd"+title);
	        Film_text n = new Film_text();
	        n.setFilm_id(1111);
	        n.setTitle(title);
			n.setDescription(description);
			
			System.out.println(n.getFilm_id()+"--------"+n.getTitle());
		
			filmTextRepository.save(n);
			return "MovieHome";
	       

	    }
}
