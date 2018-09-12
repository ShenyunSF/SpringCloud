package cn.shenyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	
	@RequestMapping("/user/{name}")
	public String getUserName(@PathVariable String name){
		return "provider2 userName:"+name;
	}
}
