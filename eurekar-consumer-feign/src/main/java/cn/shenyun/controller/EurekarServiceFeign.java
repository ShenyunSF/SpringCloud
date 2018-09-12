package cn.shenyun.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider-user")
public interface EurekarServiceFeign {
	/*
	 * 仿照服务提供者方法，写接口方法
	 */
	@RequestMapping("/user/{name}")
	public String getUserName(@PathVariable("name")String name);
}
