package com.buddybench.buddybench;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuddyBenchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuddyBenchApplication.class, args);

		System.err.println("Welcome to buddybench !!");
	}
}
