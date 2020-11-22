package com.mathguimach.demo_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathguimach.demo_springboot.entities.Category;
import com.mathguimach.demo_springboot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository cr;
	
	public List<Category> findAll() {
		return cr.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj =  cr.findById(id);
		return obj.get();
	}
}
