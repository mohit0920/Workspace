package com.mohit.db_work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DbWorkApplication {

	@GetMapping("/hello")
	public String hello(){
		return "hello from service.";
	}

	public static void main(String[] args) {
		SpringApplication.run(DbWorkApplication.class, args);
	}

}
