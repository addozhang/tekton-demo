package com.example.tekton.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TektonTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TektonTestApplication.class, args);
	}

	@GetMapping("/hi")
	public String hello() {
		return "hello, devops";
	}
}
