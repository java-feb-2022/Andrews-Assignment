package com.andrew.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Renders {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
}
