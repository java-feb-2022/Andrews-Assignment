package com.andrew.crud.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.andrew.crud.models.Expenses;
import com.andrew.crud.services.ItemService;

@Controller
public class Renders {
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("item") Expenses item, Model model) {
		model.addAttribute("items", itemService.allItems());
	return "index.jsp";
	}
	
	@PostMapping("/submit")
	public String create(@Valid @ModelAttribute("item") Expenses item, BindingResult result, Model model ) {
		if (result.hasErrors()) {	
			model.addAttribute("items", itemService.allItems());
			return "create.jsp";
		}

		itemService.createItem(item);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") Long id, Model model) {
		model.addAttribute("items", itemService.findItem(id));
		return "update.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("item") Expenses item, Model model, BindingResult result) {
		if (result.hasErrors()) {
			return "update.jsp";
		}
		itemService.updateItem(item);
		return "redirect:/";
	}
	
	@GetMapping("/item/{id}")
	public String view(@ModelAttribute("item") Expenses item, Model model, @PathVariable Long id) {
		model.addAttribute("items", itemService.findItem(id));
		return "view.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		itemService.deleteItem(id);
		return "redirect:/";
	}
	
}
