package com.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("simple/v1/")
public class SimpleController {
	
	 @GetMapping("/hello")
	    public String hello() {
	        return "Jai Hind";
	    }
}
