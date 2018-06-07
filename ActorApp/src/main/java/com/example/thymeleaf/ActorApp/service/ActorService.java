package com.example.thymeleaf.ActorApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.thymeleaf.ActorApp.bean.Actor;
import com.example.thymeleaf.ActorApp.repository.ActorRepository;
@RestController
public class ActorService {
	@Autowired
	private ActorRepository actorRepository;
	
	@GetMapping("/act")
	public List<Actor> getActors()
	{
		
		return actorRepository.findAll();
		
		
	}



}
