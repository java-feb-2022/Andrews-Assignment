package com.andrew.books.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.andrew.books.models.LoginUser;
import com.andrew.books.models.User;
import com.andrew.books.services.UserService;

@Controller
public class Renders {
	
    @Autowired
    private UserService userService;
    
    //@Autowired
    //private BookService bookService;
    
    
    //Login and Registration
    @GetMapping("/")
    public String HomeRegister(@ModelAttribute("newUser") User newUser, @ModelAttribute("newLogin") LoginUser newLogin) {
    	return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User user, BindingResult result, HttpSession session, @ModelAttribute("newLogin") LoginUser newLogin) {
    	userService.validation(user, result);
    	if(result.hasErrors()) {
    		return "redirect:/";
    	}
		userService.register(user);
		session.setAttribute("currentUser", user);
    	return "redirect:/dash";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, HttpSession session, @ModelAttribute("newUser") User user) {
    	userService.authenticate(newLogin, result);
    	if(result.hasErrors()) {
    		return "index.jsp";
    	}
    	User currentUser = userService.findByEmail(newLogin.getEmail());
    	
    	session.setAttribute("currentUser", currentUser);
    	return "redirect:/dash";
    }
    
    //Dashboard
    @GetMapping("/dash")
    public String dashboard(HttpSession session) {
    return "dash.jsp";
    }
}

