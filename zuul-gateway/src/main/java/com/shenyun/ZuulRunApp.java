package com.shenyun;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ZuulRunApp.class, args);
	}
}
