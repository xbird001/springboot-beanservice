package com.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}

}
