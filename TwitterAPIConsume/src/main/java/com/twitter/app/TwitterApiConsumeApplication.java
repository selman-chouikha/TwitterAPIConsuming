package com.twitter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories({"com.twitter.controller","com.twitter.model","com.twitter.app","com.twitter.view"})
@EntityScan({"com.twitter.controller","com.twitter.model","com.twitter.app","com.twitter.view"})
@ComponentScan({"com.twitter.controller","com.twitter.model","com.twitter.app","com.twitter.view"})
public class TwitterApiConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterApiConsumeApplication.class, args);
	}
}
