package com.andrew.ninjandojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrew.ninjandojos.models.Dojo;
import com.andrew.ninjandojos.repositories.dojoRepo;

@Service
public class DojoService {
	@Autowired
	private dojoRepo dojoRepository;
	
	//Get All
	public List<Dojo> all(){
		return dojoRepository.findAll();
	}
	
	//Create
	public Dojo create(Dojo b) {
		return dojoRepository.save(b);
	}
	
	//Update One
	public Dojo update(Dojo b) {
		return dojoRepository.save(b);
	}
	
	//Find One
	public Dojo findOne(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
	//Delete
	public void delete(Long id) {
		dojoRepository.deleteById(id);
	}
}
