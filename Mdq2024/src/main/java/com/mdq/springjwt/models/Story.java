package com.mdq.springjwt.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Story {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long storyId;
	 
	 private String title;
	 
	 private String content;
	 private String city;

	 private String photo;

	 private String author;

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//@OneToMany(mappedBy = "story", fetch = FetchType.LAZY)
	 //@ManyToOne
	 //@JoinColumn(name = "photo_id")
	 //private Photo photo; 
	 
	 //@ManyToOne
	 //@JoinColumn(name = "comment_id")
	 //private Comment comment;
	 
	 //@ManyToOne
	 //@JoinColumn(name = "blogId") // Adjust this based on your actual column name

	public Long getStoryId() {
		return storyId;
	}

	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public Story(Long storyId, String title, String content) {
		this.storyId = storyId;
		this.title = title;
		this.content = content;
		
	}
	public Story(Long storyId, String title, String content,String city, String photo, String author) {
		this.storyId = storyId;
		this.title = title;
		this.content = content;
		this.city = city;
		this.photo = photo;
		this.author = author;

	}

	public Story() {
	}

	public Story(String title, String content) {
		this.title = title;
		this.content = content;
	} 
	 
	 
	 

}
