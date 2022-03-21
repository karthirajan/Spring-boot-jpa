package com.app.webservices.users.userApp;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserJPAController {
	
	@Autowired
	private UserHardCoded userHC;
	
	@Autowired
	private UserJPARepository userJPA;
	
	@GetMapping(path = "/jpa/users")
	public List<UserBean> retrieveAllUsers() {
		
		return userJPA.findAll();
		//return userHC.findAll();
	}
	
	@DeleteMapping(path = "/jpa/users/{username}/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable String username,@PathVariable long id) {
		
		userJPA.deleteById(id);
			
    	return ResponseEntity.noContent().build();
		
	}
	
	@GetMapping(path = "/jpa/users/{username}/{id}")
	public UserBean findUser(@PathVariable String username,@PathVariable long id) {
		
		return userJPA.findById(id).get();
	
		/*
		 * UserBean user = userHC.findById(id); return user;
		 */
		
	}
	
	@PutMapping(path = "/jpa/users/{username}/{id}")
	public ResponseEntity<UserBean> updateUser(@PathVariable String username,@PathVariable long id,@RequestBody UserBean user) {
		
	  UserBean updatedUser = userJPA.save(user);
		
	  return new ResponseEntity<UserBean>(updatedUser,HttpStatus.OK);
	}
	
	@PostMapping(path = "/jpa/users/{username}")
	public ResponseEntity<Void> addUser(@PathVariable String username,@RequestBody UserBean user) {
		
		UserBean addUser = userJPA.save(user);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addUser.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
		
		
	}

}
