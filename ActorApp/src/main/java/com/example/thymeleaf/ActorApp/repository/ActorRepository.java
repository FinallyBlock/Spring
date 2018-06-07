package com.example.thymeleaf.ActorApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thymeleaf.ActorApp.bean.Actor;



public interface ActorRepository extends JpaRepository<Actor,Integer>{

}