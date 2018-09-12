package cn.shenyun;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication//集成了hystrix
@EnableFeignClients
public class ConsumerHystrixRun {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerHystrixRun.class, args);
	}
}
