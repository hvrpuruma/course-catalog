package com.coursecatalog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String getName(@RequestParam(value = "name", defaultValue = "People") String name) {
		return "Hi " + name;
	}
}
