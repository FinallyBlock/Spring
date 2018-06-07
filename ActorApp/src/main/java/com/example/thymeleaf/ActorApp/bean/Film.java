package com.example.thymeleaf.ActorApp.bean;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {
	@Id
	@GeneratedValue
	private int film_id;
	private String title;
	private String description;
	private String release_year;
	public Film(int film_id, String title, String description, String release_year) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
	}
	
	public Film(){}
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
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title + ", description=" + description + ", release_year="
				+ release_year + "]";
	}

	public static void addAttribute(String string, Optional<Film> film) {
		// TODO Auto-generated method stub
		
	}
	
	
}
