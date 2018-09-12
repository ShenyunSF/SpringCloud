package cn.shenyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private EurekarServiceFeign eurekarServiceFeign;
	
	@RequestMapping("/user/{name}")
	public String getUserName(@PathVariable("name")String name){
		return eurekarServiceFeign.getUserName(name);
	}
}
