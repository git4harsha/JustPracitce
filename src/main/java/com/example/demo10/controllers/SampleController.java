package com.example.demo10.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/hello")
	public @ResponseBody String hello() {
		return "hello world !";
	}
}
