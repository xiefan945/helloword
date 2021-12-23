package com.example.helloword;

import java.util.Timer;
import java.lang.Thread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
		while(true){
			System.out.println("hello,world!");
		}
	}

}
