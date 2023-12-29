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

	public Story() {
	}

	public Story(String title, String content) {
		this.title = title;
		this.content = content;
	} 
	 
	 
	 

}
