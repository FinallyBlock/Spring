package com.example.thymeleaf.ActorApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thymeleaf.ActorApp.bean.Film;
import com.example.thymeleaf.ActorApp.bean.Film_text;

public interface FilmTextRepository extends JpaRepository<Film_text,Integer>{

}
