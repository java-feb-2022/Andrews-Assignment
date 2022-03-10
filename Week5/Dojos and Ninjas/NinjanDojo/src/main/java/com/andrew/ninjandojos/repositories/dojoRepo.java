package com.andrew.ninjandojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andrew.ninjandojos.models.Dojo;

@Repository
public interface dojoRepo extends CrudRepository <Dojo, Long> {
	
	List<Dojo> findAll();
}
