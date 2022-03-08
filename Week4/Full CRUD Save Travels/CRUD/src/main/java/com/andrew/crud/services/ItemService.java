package com.andrew.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrew.crud.models.Expenses;
import com.andrew.crud.repositories.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	//Get All
	public List<Expenses> allItems(){
		return itemRepository.findAll();
	}
	
	//Create
	public Expenses createItem(Expenses b) {
		return itemRepository.save(b);
	}
	
	//Update One
	public Expenses updateItem(Expenses b) {
		return itemRepository.save(b);
	}
	
	//Find One
	public Expenses findItem(Long id) {
		Optional<Expenses> optionalItem = itemRepository.findById(id);
		
		if(optionalItem.isPresent()) {
			return optionalItem.get();
		} 
		else {
			return null;
		}
	}
	
	//Delete
	public void deleteItem(Long id) {
		itemRepository.deleteById(id);
	}
}
