package com.andrew.omikujiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/")
	public String index() {
		return index.jsp;
	}
	/**
	@RequestMapping("/result")
	public String login(
			@RequestParam() String i,
			@RequestParam() String x) {
		return result.jsp;
	}
	**/
}
