package com.appsdeveloperblog.app.ws.ui.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {
	
	Map<String, UserRest> users;

	@GetMapping
	public String getUsers(@RequestParam(value="page", defaultValue = "1") int page,
			@RequestParam(value="limit", defaultValue = "5") int limit) {
		return "Get user was called page:" + page + ", limit:" + limit;
	}	
	
	@GetMapping(path="/{userId}", 
			produces = {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE,
			})
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		if(users.containsKey(userId)){
			return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
		}else {
			return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		}		
	}
	
	@PostMapping(
			consumes = {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE,
			},
			produces = {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE,
			}
	)
	public ResponseEntity<UserRest> createUser(@Valid @RequestBody UserDetailsRequestModel userDetails) {		
		
		UserRest returnValue = new UserRest();		
		
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstname());
		returnValue.setLastName(userDetails.getLastname());
		
		String userId = UUID.randomUUID().toString();
		returnValue.setUserId(userId);
		
		if(users == null) users = new HashMap<>();
		users.put(userId, returnValue);
		
		return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	
	@DeleteMapping
	public String deteleUser() {
		return "delete user was called";
	}
	
	
}
