package com.app.webservices.users.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class HelloWorldController {
	
	// GET | PUT | POST | DELETE
	//Base URL = https://localhost:8080
	
	@GetMapping(path = "/basicAuth")
	public HelloWorldBean helloWorldBasicAuth() {
		
		return new HelloWorldBean("authenticated");
			
	}
	
	@GetMapping(path = "/hello")
	public String hello() {
		
		return "Hello";
		
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorld() {
		
		return new HelloWorldBean("Welcome API Session",12);
			
	}
	
	@GetMapping(path = "/hello-world-bean/{username}")
	public HelloWorldBean helloWorld(@PathVariable String username) {
		
		return new HelloWorldBean(String.format("Welcome API Session %s", username),2341);
			
	}
	
	@GetMapping(path = "/hello-world-bean/users")
	public List<HelloWorldBean> helloWorldList() {
		
		throw new RuntimeException("Something went wrong");
		
		/*
		 * List<HelloWorldBean> l = new ArrayList<HelloWorldBean>(); HelloWorldBean h1 =
		 * new HelloWorldBean("karthi", 10); HelloWorldBean h2 = new
		 * HelloWorldBean("sabari", 12); HelloWorldBean h3 = new HelloWorldBean("satya",
		 * 13);
		 * 
		 * l.add(h1); l.add(h2); l.add(h3);
		 * 
		 * return l;
		 */
			
	}

}
