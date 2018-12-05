package com.hatim.basics.springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BasicsSpringBootConsoleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BasicsSpringBootConsoleApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		
		System.out.println("Do any thing here... its a command space");
		return null;
	}
	
}
