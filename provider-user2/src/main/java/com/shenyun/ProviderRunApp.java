package com.shenyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;import com.google.inject.Provider;

@SpringBootApplication
@EnableEurekaClient
public class ProviderRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ProviderRunApp.class, args);
	}
}
