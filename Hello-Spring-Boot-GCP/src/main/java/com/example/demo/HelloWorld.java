/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
public class HelloWorld {
	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Say Hello";
	}
}