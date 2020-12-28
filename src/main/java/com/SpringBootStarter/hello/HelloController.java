package com.SpringBootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// used only for GET method
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
