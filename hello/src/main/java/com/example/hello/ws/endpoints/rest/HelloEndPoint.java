package com.example.hello.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndPoint {

	@RequestMapping("/")
	public String home() {
		return "hello world!";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/echo", produces="text/plain")
	public String echo(@RequestBody String body) {
		return body;
	}
}
