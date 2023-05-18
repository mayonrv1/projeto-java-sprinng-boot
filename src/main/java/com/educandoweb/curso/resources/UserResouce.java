package com.educandoweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L ,"Maria", "Maria@gmail.com", "92338216", "123456");
                   return ResponseEntity.ok().body(u);
	
	}

}
