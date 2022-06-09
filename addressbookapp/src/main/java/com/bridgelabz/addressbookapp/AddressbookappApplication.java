package com.bridgelabz.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressbookappApplication {

	public static void main(String[] args) {

		System.out.println("Welcome To AddressBook App");
		SpringApplication.run(AddressbookappApplication.class, args);
		log.info("Addressbook App started");
	}

}
