package com.sopra.api.katapotter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sopra.api.katapotter")
public class KataPotterApplication {

	public static void main(String[] args) {
		SpringApplication.run(KataPotterApplication.class, args);
	}
}
