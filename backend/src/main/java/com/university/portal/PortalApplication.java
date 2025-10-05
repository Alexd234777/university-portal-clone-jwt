package com.university.portal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class PortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            if (userRepository.findByUsername("admin").isEmpty()) {
                User admin = new User("admin", "adminpass", Set.of(Role.ROLE_ADMIN));
                userRepository.save(admin);
            }
            if (userRepository.findByUsername("student").isEmpty()) {
                User student = new User("student", "studentpass", Set.of(Role.ROLE_STUDENT));
                userRepository.save(student);
            }
        };
    }
}
