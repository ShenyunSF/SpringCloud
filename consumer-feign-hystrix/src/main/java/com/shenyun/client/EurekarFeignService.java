package com.shenyun.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="provider-user")
public interface EurekarFeignService {
	@RequestMapping(value="/hello/{name}",method=RequestMethod.GET)
	public String hello(@PathVariable("name") String name);
}
