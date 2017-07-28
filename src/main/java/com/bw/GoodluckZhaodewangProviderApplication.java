package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GoodluckZhaodewangProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodluckZhaodewangProviderApplication.class, args);
	}
}
