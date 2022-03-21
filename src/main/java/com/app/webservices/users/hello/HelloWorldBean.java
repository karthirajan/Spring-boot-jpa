package com.app.webservices.users.hello;

public class HelloWorldBean {
	
	private String message;
	
	private int id;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldBean(String message,int id) {
		super();
		this.message = message;
		this.id = id;
	}
	
	public HelloWorldBean(String message) {
		super();
		this.message = message;
		
	}

	
	
	
	

}
