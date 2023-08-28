package com.charlesedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlesedu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
