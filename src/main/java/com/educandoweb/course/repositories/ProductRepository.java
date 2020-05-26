package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;

//@Repository - registra a classe como componente do Spring e pode ser injetado automaticamente igual o @Autowired. 
//              Não está sendo usado neste caso, pois a interface UserRepository já herda essa função através do JpaRepository<User, Long>
public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
