package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

//@Component  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
@Service  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
public class OrderService {

	@Autowired //tem a função de injetar dependências automaticamente pelo Spring.
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
