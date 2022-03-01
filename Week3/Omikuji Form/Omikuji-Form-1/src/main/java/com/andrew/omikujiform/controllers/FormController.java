package com.andrew.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@GetMapping("/")
	public String form(HttpSession session) {
		return "index.jsp";
	}
	
	@PostMapping("/submit")
	public String submit(
			@RequestParam(value="number") int number,
			@RequestParam(value="name") String name,
			@RequestParam(value="city") String city,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="living") String living,
			@RequestParam(value="nice") String nice,
			HttpSession session) {
		String render = String.format(
				"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.",
				number, city, name, hobby, living, nice);
		session.setAttribute("render", render);
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String render(HttpSession session, Model model) {
		String render = (String) session.getAttribute("render");
		model.addAttribute("render", render);
		return "render.jsp";
	}
}
