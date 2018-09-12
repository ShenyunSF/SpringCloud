package cn.shenyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.shenyun.feign.EurekarServiceFeign;
import cn.shenyun.sidecar.Sidecar;

@RestController
public class UserController {
	@Autowired
	private EurekarServiceFeign eurekarServiceFeign;
	
	@Autowired
	private Sidecar sidecar;
	
	@RequestMapping("/user/{name}")
	@HystrixCommand(fallbackMethod="userFallback")
	public String getUserName(@PathVariable("name")String name){
		return eurekarServiceFeign.getUserName(name);
	}
	//对应接口中的参数和返回值
	public String userFallback(String name){
		return "hystrix warning:error!!";
	}
	//实现sidecar对nodejs封装
	@RequestMapping("/index")
	public String node(){
		return sidecar.node();//在feign的接口中定义
	}
}
