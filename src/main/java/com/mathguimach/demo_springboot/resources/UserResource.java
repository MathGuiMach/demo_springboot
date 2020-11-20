package com.mathguimach.demo_springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathguimach.demo_springboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping 
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"a","b","c","d");
		return ResponseEntity.ok().body(u);
	}
	
}
