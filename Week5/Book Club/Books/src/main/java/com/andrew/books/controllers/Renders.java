package com.andrew.books.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.andrew.books.models.Book;
import com.andrew.books.models.LoginUser;
import com.andrew.books.models.User;
import com.andrew.books.services.BookService;
import com.andrew.books.services.UserService;

@Controller
public class Renders {
	
    @Autowired
    private UserService userService;
    
    @Autowired
    private BookService bookService;
    
    
    //Login and Registration
    @GetMapping("/")
    public String HomeRegister(@ModelAttribute("newUser") User newUser, @ModelAttribute("newLogin") LoginUser newLogin, HttpSession session) {
    	if(session.getAttribute("currentUser") != null) {
    		return "redirect:/dash";
    	}
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
    
    @GetMapping("/logout")
    public String logOut(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
    
    //Dashboard
    @GetMapping("/dash")
    public String dashboard(Model model, HttpSession session) {
    	if(session.getAttribute("currentUser") == null) {
    		return "redirect:/";
    	}
    	model.addAttribute("book", bookService.findAll());
    return "dash.jsp";
    }
    
    //Books
    @GetMapping("/book/new")
    public String newBook(Book book, HttpSession session) {
    	if(session.getAttribute("currentUser") == null) {
    		return "redirect:/";
    	}
    	return "newbook.jsp";
    }
    
    @PostMapping("/book/submit")
    public String submitBook(@Valid @ModelAttribute("newBook") Book book, BindingResult result) {
    	if(result.hasErrors()) {
    		return "redirect:/book/new";
    	}
    	bookService.addBook(book);
    	return "redirect:/dash";
    }
    
    @GetMapping("/book/{id}")
    public String book( Model model, @PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("currentUser") == null) {
    		return "redirect:/";
    	}
    	model.addAttribute("book", bookService.findById(id));
    	return "showbook.jsp";
    }
    
    @GetMapping("/book/edit/{id}")
    public String edit(Model model, @PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("currentUser") == null) {
    		return "redirect:/";
    	}
    	model.addAttribute("book", bookService.findById(id));
    	return "edit.jsp";
    }
    
    @PostMapping("/book/submit/{id}")
    public String editBook(@ModelAttribute("editBook") Book book, @PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("currentUser") == null) {
    		return "redirect:/";
    	}
    	bookService.editBook(book);
    	return "redirect:/book/" + id;
    }
}

