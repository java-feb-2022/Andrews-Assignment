package com.andrew.ninjandojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrew.ninjandojos.models.Ninja;
import com.andrew.ninjandojos.repositories.dojoRepo;

public class NinjaService {
	@Autowired
	private dojoRepo ninjaRepository;
	
	//Get All
	public List<Ninja> all(){
		return ninjaRepository.findAll();
	}
	
	//Create
	public Ninja create(Expenses b) {
		return ninjaRepository.save(b);
	}
	
	//Update One
	public Ninja update(Expenses b) {
		return ninjaRepository.save(b);
	}
	
	//Find One
	public Ninja findOne(Long id) {
		Optional<Ninja> optionalItem = ninjaRepository.findById(id);
		
		if(optionalItem.isPresent()) {
			return optionalItem.get();
		} 
		else {
			return null;
		}
	}
	
	//Delete
	public void delete(Long id) {
		ninjaRepository.deleteById(id);
	}
}
