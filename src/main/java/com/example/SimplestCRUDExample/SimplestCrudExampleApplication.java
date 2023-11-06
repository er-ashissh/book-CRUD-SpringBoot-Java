package com.example.SimplestCRUDExample;

import com.example.SimplestCRUDExample.controller.BookController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = BookController.class)
public class SimplestCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplestCrudExampleApplication.class, args);
	}

}
