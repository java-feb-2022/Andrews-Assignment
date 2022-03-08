package com.andrew.crud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andrew.crud.models.Expenses;

@Repository
public interface ItemRepository extends CrudRepository <Expenses, Long> {
	
	List<Expenses> findAll();
}
