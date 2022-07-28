package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;

import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
			new Student(
				1L,
				"Ichlasul Amal",
				"ichlasul0899@gmail.com",
				LocalDate.of(1999, Month.AUGUST, 26)
			)
		);
	}
	// public List<String> fullname(){
	// 	return List.of("Ichlasul", "Amal");
	// }

	// public String hello(){
	// 	return "Hello World";
	// }

}
