package com.org.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroService {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MicroService.class, args);
	}
	
	@RequestMapping (value = "/")
	public String demo() {
     return "This is a microservice";
	}
}

