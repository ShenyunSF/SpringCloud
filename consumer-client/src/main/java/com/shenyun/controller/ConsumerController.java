package com.shenyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
    	String url="http://provider-user/hello/"+name;
    	return this.restTemplate.getForObject(url, String.class);
    }
	@RequestMapping("/user/{name}")
	public String getName(@PathVariable String name) {
    	
    	return name;
    }
	
}
