package com.example.springaccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringaccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaccountApplication.class, args);
	}

}
