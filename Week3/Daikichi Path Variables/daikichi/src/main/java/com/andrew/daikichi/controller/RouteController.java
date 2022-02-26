package com.andrew.daikichi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class RouteController {
	@RequestMapping("")
	public static String Hello() {
		return "Hello World";
	}
	
	@RequestMapping("/today")
	public static String Today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public static String Tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}
