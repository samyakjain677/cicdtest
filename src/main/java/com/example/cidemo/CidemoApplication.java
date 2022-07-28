package com.example.cidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CidemoApplication.class, args);
	}

	@GetMapping(value = "/")
	public String getWelcomeMessage(){
		return "First CI/CD demo with second build";
	}


}
