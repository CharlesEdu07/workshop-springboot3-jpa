package com.charlesedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlesedu.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
