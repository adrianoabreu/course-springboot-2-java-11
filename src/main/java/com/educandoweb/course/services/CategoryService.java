package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

//@Component  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
@Service  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
public class CategoryService {

	@Autowired //tem a função de injetar dependências automaticamente pelo Spring.
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
