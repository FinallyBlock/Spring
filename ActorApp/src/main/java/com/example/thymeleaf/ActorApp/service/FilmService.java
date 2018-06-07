package com.example.thymeleaf.ActorApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.thymeleaf.ActorApp.bean.Film;
import com.example.thymeleaf.ActorApp.repository.FilmRepository;

public class FilmService {

	@Autowired
	private FilmRepository filmRepository;
	
	@GetMapping("/Film")
	public List<Film> getActors()
	{
		
		return filmRepository.findAll();
		
		
	}

}
