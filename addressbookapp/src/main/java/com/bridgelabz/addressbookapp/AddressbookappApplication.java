package com.bridgelabz.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressbookappApplication {

	public static void main(String[] args) {

		System.out.println("Welcome To Address Book Application");
		ApplicationContext context = SpringApplication.run(AddressbookappApplication.class, args);
		log.info("Addressbook App Started in {} Environment",
				context.getEnvironment().getProperty("environment"));
		log.info("AddressBook App DB User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));
		log.info("Addressbook App started");
	}

}
