package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//@Component  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
@Service  //registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired
public class UserService {

	@Autowired //tem a função de injetar dependências automaticamente pelo Spring.
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
