package com.andrew.ninjandojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrew.ninjandojos.models.Ninja;
import com.andrew.ninjandojos.repositories.ninjaRepo;

@Service
public class NinjaService {
	@Autowired
	private ninjaRepo ninjaRepository;
	
	//Get All
	public List<Ninja> all(){
		return ninjaRepository.findAll();
	}
	
	//Create
	public Ninja create(Ninja b) {
		return ninjaRepository.save(b);
	}
	
	//Update One
	public Ninja update(Ninja b) {
		return ninjaRepository.save(b);
	}
	
	//Find One
	public Ninja findOne(Long id) {
		return ninjaRepository.findById(id).orElse(null);
	}
	
	//Delete
	public void delete(Long id) {
		ninjaRepository.deleteById(id);
	}
}
