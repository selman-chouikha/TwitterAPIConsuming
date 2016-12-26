package com.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TwitterApiConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterApiConsumeApplication.class, args);
	}
}
