package com.andrew.books.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
		
		//Title
		@NotEmpty(message="Title is required!")
	    @Size(min=3, message="Title must be longer than 3 characters")
		private String title;
		
		//Author
		@NotEmpty(message="Author is required!")
		@Size(min=3, message="Author name must be longer than 3 characters")
		private String author;

		//Thoughts
		@NotEmpty(message="Thought is required!")
	    @Size(min=3, message="Thoughts must be longer than 3 characters")
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
	    
	    //User
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User users;

	    //Getters and Setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
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
		public User getUsers() {
			return users;
		}
		public void setUsers(User users) {
			this.users = users;
		}

}
