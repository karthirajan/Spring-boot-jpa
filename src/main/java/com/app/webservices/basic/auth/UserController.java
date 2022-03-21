package com.app.webservices.basic.auth;

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
public class UserController {
	
	/*
	 * @Autowired private UserHardCoded userHC;
	 * 
	 * @GetMapping(path = "/users") public List<UserBean> retrieveAllUsers() {
	 * return userHC.findAll(); }
	 * 
	 * @DeleteMapping(path = "/users/{username}/{id}") public ResponseEntity<Void>
	 * deleteUser(@PathVariable String username,@PathVariable int id) {
	 * 
	 * UserBean user = userHC.deleteById(id);
	 * 
	 * if(user != null) { return ResponseEntity.noContent().build(); }
	 * 
	 * return ResponseEntity.notFound().build();
	 * 
	 * }
	 * 
	 * @GetMapping(path = "/users/{username}/{id}") public UserBean
	 * findUser(@PathVariable String username,@PathVariable int id) {
	 * 
	 * UserBean user = userHC.findById(id); return user;
	 * 
	 * }
	 * 
	 * @PutMapping(path = "/users/{username}/{id}") public ResponseEntity<UserBean>
	 * updateUser(@PathVariable String username,@PathVariable int id,@RequestBody
	 * UserBean user) {
	 * 
	 * UserBean updatedUser = userHC.save(user);
	 * 
	 * return new ResponseEntity<UserBean>(updatedUser,HttpStatus.OK); }
	 * 
	 * @PostMapping(path = "/users/{username}") public ResponseEntity<Void>
	 * addUser(@PathVariable String username,@RequestBody UserBean user) {
	 * 
	 * UserBean addUser = userHC.save(user);
	 * 
	 * URI uri =
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
	 * (addUser.getId()).toUri();
	 * 
	 * return ResponseEntity.created(uri).build();
	 * 
	 * 
	 * }
	 */

}
