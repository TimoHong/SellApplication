package com.TimoProject.Sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"entertainment", "readinglist"})
@SpringBootApplication(scanBasePackages = "com.TimoProject.Sell")
public class SellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellApplication.class, args);
	}

}
