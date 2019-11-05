package com.house.restful.homeproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	

    @RequestMapping("/greeting")
    //public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println("******************************");
    	return "test";
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
    }

    @RequestMapping("/test")
    public String test() {
    	return "****testing****";
    }
    
//    @RequestMapping("/API/createUser/")
//    public User	
    
}
