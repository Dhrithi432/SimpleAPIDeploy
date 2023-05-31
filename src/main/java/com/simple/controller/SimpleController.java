package com.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("ust/simple/")
@RestController
public class SimpleController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Jai Hind";
	}
}
