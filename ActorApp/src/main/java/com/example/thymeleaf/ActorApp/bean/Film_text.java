package com.example.thymeleaf.ActorApp.bean;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film_text {
   @Id
	private int film_id;
	private String title;
	private String description;
	public Film_text(int film_id, String title, String description) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
	}
	
	public Film_text(){}
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title + ", description=" + description+" ]";
	}


	
	
}
