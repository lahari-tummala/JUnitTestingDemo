package com.springboot.junittestingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JUnitTestingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JUnitTestingDemoApplication.class, args);
		System.out.println("Testing...");
	}

}
