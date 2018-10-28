package com.shenyun.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello/{name}")
	public String hello1(@PathVariable String name) {
		return "1:"+name;
	}
}

