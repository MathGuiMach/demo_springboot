package com.mathguimach.demo_springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathguimach.demo_springboot.entities.User;
import com.mathguimach.demo_springboot.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService us;
	
	@GetMapping 
	public ResponseEntity<List<User>> findAll(){
		List<User> list = us.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = us.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
