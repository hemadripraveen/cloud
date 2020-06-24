package com.eureka.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.auth.model.User;

@RestController
public class LoginController {

	@PostMapping("/auth/register")
	public String registerUser(@RequestBody User user) {
		System.out.println("user added to list /auth/register");
		return "success";
	}
}
