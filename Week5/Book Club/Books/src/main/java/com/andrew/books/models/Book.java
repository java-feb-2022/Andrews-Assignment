package com.andrew.books.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		//Name
		@NotEmpty(message="Title is required!")
	    @Size(min=3, message="Title must be longer than 3 characters")
		private String title;
		
		//Thoughts
		@NotEmpty(message="Thought is required!")
	    @Size(min=3, message="Username must be longer than 3 characters")
		private String thoughts;
		
	
		//DateTime
		@Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	    private Date createdAt;
		
	    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	    private Date updatedAt;	
	    
		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	    
	    //Getters and Setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return title;
		}
		public void setName(String name) {
			this.title = name;
		}
		public String getThoughts() {
			return thoughts;
		}
		public void setThoughts(String thoughts) {
			this.thoughts = thoughts;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
}
