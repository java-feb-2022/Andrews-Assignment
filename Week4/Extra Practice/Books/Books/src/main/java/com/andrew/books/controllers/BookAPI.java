package com.andrew.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.andrew.books.models.Book;
import com.andrew.books.services.BookService;

@Controller
public class BookAPI {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}
	
	@PostMapping("/api/books")
	public Book create(
			@RequestParam(value="title")String title, 
			@RequestParam(value="description") String desc, 
			@RequestParam(value="language") String lang, 
			@RequestParam(value="pages") Integer pages) 
	{
	 	Book book = new Book(title, desc, lang, pages);
				return bookService.createBook(book);
	}
	
	
}
