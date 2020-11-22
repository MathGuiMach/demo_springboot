package com.mathguimach.demo_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathguimach.demo_springboot.entities.Order;
import com.mathguimach.demo_springboot.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository or;
	
	public List<Order> findAll() {
		return or.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj =  or.findById(id);
		return obj.get();
	}
}
