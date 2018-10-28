package com.shenyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shenyun.client.EurekarFeignService;

@RestController
public class HelloController {
	@Autowired
	private EurekarFeignService  eurekarFeignService;
	
	@GetMapping("/hello/{name}")
	public String getName(@PathVariable("name")String name) {
		return eurekarFeignService.hello(name);
	}
	
	@GetMapping("/hystrix/{name}")
	@HystrixCommand(fallbackMethod="fallback01")
	public String testHystrix(@PathVariable("name")String name) {
		return eurekarFeignService.hello(name);
	}
	public String fallback01(String name) {
		return "hystrix ok";
	}
}
