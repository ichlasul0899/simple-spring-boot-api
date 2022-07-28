package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student amal = new Student(
                "Ichlasul Amal",
                "ichlasul0899@gmail.com",
                LocalDate.of(1999, Month.AUGUST, 26)
            );

            Student ihdhar = new Student(
                "Rafif Ihdhar",
                "ihdhar@gmail.com",
                LocalDate.of(1999, Month.JANUARY, 25)
            );

            studentRepository.saveAll(List.of(amal, ihdhar));

        };
    }
}
