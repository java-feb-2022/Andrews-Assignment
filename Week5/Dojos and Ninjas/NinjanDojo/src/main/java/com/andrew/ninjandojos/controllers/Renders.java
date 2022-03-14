package com.andrew.ninjandojos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.andrew.ninjandojos.models.Dojo;
import com.andrew.ninjandojos.models.Ninja;
import com.andrew.ninjandojos.services.DojoService;
import com.andrew.ninjandojos.services.NinjaService;


@Controller
public class Renders {

	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("dojo", dojoService.all());
	return "index.jsp";
	}
	
	@GetMapping("/dojo")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
	return "NewDojo.jsp";
	}
	
	@PostMapping("/dojo/submit")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model ) {
		if (result.hasErrors()) {
			return "NewDojo.jsp";
		}
		dojoService.create(dojo);
		return "redirect:/";
	}
	
	
	@GetMapping("/dojo/{id}")
	public String viewDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.findOne(id));
		return "Dojo.jsp";
	}
	
	@GetMapping("/ninja")
	public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojo", dojoService.all());
		return "Ninja.jsp";
	}
	
	@PostMapping("/ninja/submit")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, Dojo dojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "Ninja.jsp";
		}
		ninjaService.create(ninja);
		return "redirect:/";
	}
}
