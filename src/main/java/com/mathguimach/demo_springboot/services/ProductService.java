package com.mathguimach.demo_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathguimach.demo_springboot.entities.Product;
import com.mathguimach.demo_springboot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository cr;
	
	public List<Product> findAll() {
		return cr.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj =  cr.findById(id);
		return obj.get();
	}
}
