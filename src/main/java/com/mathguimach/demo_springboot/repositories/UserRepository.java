package com.mathguimach.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mathguimach.demo_springboot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
