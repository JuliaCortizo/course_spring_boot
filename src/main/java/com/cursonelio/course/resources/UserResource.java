package com.cursonelio.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursonelio.course.entities.UserDomain;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<UserDomain> findAll(){
		UserDomain u = new UserDomain(1, "Ju", "d", "828282", "kakaka");
		return ResponseEntity.ok().body(u);
	}
}
