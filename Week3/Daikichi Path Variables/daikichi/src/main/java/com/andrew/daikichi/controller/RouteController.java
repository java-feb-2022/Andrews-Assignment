package com.andrew.daikichi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class RouteController {
	
	//Diakichi Routes
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
	
	
	//Daikichi Path Variables
	@RequestMapping("/travel/{city}")
	public String City(@PathVariable("city") String city) {
		return "Welcome to the city of " + city + "! We hope you have a pleasent stay";
	}
	
	@RequestMapping("/lotto/{number}")
	public String Fortune(@PathVariable("number") int number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
}
