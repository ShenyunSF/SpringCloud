package cn.shenyun;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class EurekarFeignRun {
	public static void main(String[] args) {
		SpringApplication.run(EurekarFeignRun.class, args);
	}
}
