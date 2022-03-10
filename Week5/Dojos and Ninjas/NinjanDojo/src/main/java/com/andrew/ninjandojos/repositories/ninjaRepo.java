package com.andrew.ninjandojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andrew.ninjandojos.models.Ninja;

@Repository
public interface ninjaRepo extends CrudRepository <Ninja, Long> {
	
	List<Ninja> findAll();
}
