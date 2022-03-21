package com.app.webservices.users;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Bencrypt {
	
	public static void main(String[] args) {
		
		BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		
		String encode = b.encode("rajan");
		System.out.println(encode);
		
	}

}
