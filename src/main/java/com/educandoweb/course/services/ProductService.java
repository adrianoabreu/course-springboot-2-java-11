package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

//@Component  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
@Service  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
public class ProductService {

	@Autowired //tem a função de injetar dependências automaticamente pelo Spring.
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
