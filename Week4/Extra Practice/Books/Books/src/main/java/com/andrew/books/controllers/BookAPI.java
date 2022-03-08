package com.andrew.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.andrew.books.models.Book;
import com.andrew.books.services.BookService;

@Controller
public class BookAPI {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/api/books")
	public String index(Model model, @ModelAttribute Book newBook) {
		model.addAttribute("books", bookService.allBooks());
		return "index.jsp";
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
