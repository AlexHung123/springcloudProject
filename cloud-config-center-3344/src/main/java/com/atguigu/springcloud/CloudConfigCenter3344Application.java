package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigCenter3344Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigCenter3344Application.class, args);
	}

}
