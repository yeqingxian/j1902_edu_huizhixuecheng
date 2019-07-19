package com.edu.hzxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer     //start EurekaServer
@SpringBootApplication
public class HzxcEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzxcEurekaServerApplication.class, args);
	}

}
