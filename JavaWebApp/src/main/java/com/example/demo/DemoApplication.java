package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		String name = "ESEMFON"

		System.out.print(name);

		Integer age = "20"
		System.out.print(age + 5);

		Integer tim = "2"
		System.out.print(tim + 5);
	}

}
