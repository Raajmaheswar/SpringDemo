package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	

	@GetMapping("demo")
	String demo() {
		System.out.println("Logging the details");
		return "This is demo";
	}

}
