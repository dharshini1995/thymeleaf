package com.thymeleaf.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;



	
	@SpringBootApplication
	@ComponentScan
	//@EnableJpaRepositories(basePackages= {"com.springboot.watertank.repository"})
	//@EntityScan(basePackages= {""})

	public class SpringMainAppEntry {
		
		public static void main(String[] args) {
			
			SpringApplication.run(SpringMainAppEntry.class, args);
			
		}


}

