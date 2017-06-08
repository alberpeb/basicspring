package com.perezbonin.basicspring.restfullapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@SpringBootApplication
@Configuration
@ComponentScan({"com.perezbonin.basicspring"})
public class RestfullApp {

	public static void main(String[] args) {
		SpringApplication.run(RestfullApp.class, args);
	}

}
