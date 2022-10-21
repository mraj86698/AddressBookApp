package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class AddressBookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AddressBookAppApplication.class, args);
		System.out.println("Welcome to AddressBook App");
		log.info("Application Started");

		log.info("Address Book App has Started in {} Environment",context.getEnvironment().getProperty("environment"));
        log.info("Database : User Name is {}",context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
