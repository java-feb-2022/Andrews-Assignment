package com.andrew.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrew.books.models.Book;
import com.andrew.books.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	//Add
	public Book addBook(Book newBook) {
		bookRepository.save(newBook);
		return null;
	}
	
	//Find
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
	public Book findById(Long id) {
		
		Optional<Book> result = bookRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}

	public Book editBook(Book book) {
		return bookRepository.save(book);
	}
}
