package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student achref= new Student(
                    "achref",
                    "achrefbenkacem96@gmail.com",
                    LocalDate.of(1996,12,3)
            );
            Student walid= new Student(
                    124L,
                    "walid",
                    "walidKaleb@kaleb.com",
                    LocalDate.of(2000,10,5)
            );
            repository.saveAll(
                    List.of(achref,walid)
            );
        };
    }
}
