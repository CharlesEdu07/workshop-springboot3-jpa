package com.charlesedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlesedu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
