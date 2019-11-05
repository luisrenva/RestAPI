package com.house.restful.homeproject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Actions {
	
	@Bean
	 public RestTemplate rest() {
		return new RestTemplate();
	 }
	
	@Autowired
	 RestTemplate restTemplate;
	
	@RequestMapping("/API/todos/{id}")
	public String todos(@PathVariable("id") int id) {
		return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/"+ id, String.class);
	}
	
	@RequestMapping("/healthy")
	public String health() {
		return "Healthy";
	}

}
