package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam =  new Student(
                    "mariam",
                    "mariam@gmail.com",
                    LocalDate.of(1995, Month.JANUARY, 5));
            Student alex =  new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 5));
            repository.saveAll(
                    List.of(mariam,alex));
        };
    }
}
