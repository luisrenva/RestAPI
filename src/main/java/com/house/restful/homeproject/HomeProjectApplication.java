package com.house.restful.homeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
@Configuration
public class HomeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeProjectApplication.class, args);
	}

}
