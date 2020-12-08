package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//it performs auto-configurations based on your library
//it performs component scanning from its packages till end
//of its sub-package
@SpringBootApplication 
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
		System.out.println("helo hima");
	}

}
