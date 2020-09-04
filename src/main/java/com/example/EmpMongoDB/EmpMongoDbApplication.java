package com.example.EmpMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMongoDbApplication.class, args);
		System.out.println("MongoDB Application");
	}

}
