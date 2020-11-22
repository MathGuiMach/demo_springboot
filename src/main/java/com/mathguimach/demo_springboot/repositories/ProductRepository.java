package com.mathguimach.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mathguimach.demo_springboot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
