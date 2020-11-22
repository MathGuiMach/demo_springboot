package com.mathguimach.demo_springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathguimach.demo_springboot.entities.Order;
import com.mathguimach.demo_springboot.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService us;
	
	@GetMapping 
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = us.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = us.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
