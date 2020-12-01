package com.mathguimach.demo_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathguimach.demo_springboot.entities.User;
import com.mathguimach.demo_springboot.repositories.UserRepository;
import com.mathguimach.demo_springboot.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public List<User> findAll() {
		return ur.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj =  ur.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return ur.save(obj);
	}
	
	public void delete(Long id) {
		ur.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = ur.getOne(id);
		updateData(entity, obj);
		return ur.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
