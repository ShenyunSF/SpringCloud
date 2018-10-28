package com.shenyun;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker 
/*开启hystrix，虽然@SpringCloudApplication注解集成了@EnableCircuitBreaker，
 * 但是不配置该注解就不能实现hystrix断路器的功能*/
public class ConsumerRunApp {
 public static void main(String[] args) {
	SpringApplication.run(ConsumerRunApp.class, args);
}
}
