package com.example.studentapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hassan = new Student(
                    "Hassan",
                    "john@gmail.com",
                    LocalDate.of(2002, AUGUST, 9)
            );
            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000, APRIL, 1)
            );
            Student abdo = new Student(
                    "abdo",
                    "abdo2022@gmail.com",
                    LocalDate.of(2001, MARCH, 3)
            );

            repository.saveAll(List.of(hassan,john, abdo));
        };
    }
}
