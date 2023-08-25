package com.charlesedu.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.charlesedu.course.entities.User;
import com.charlesedu.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Hally", "hally@gmail.com", "99999999", "12345");
        User user2 = new User(null, "John", "john@gmail.com", "88888888", "12345");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
