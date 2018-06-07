package com.example.thymeleaf.ActorApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.thymeleaf.ActorApp.bean.Film;



public interface FilmRepository extends JpaRepository<Film,Integer>{

	 @Query("select f from Film f where f.id = ?1")
	  Film findByAnId(int id);
	 
	    }
	



