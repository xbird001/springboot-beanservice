package com.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigeration {

	@Bean
	public Runnable createRunnable() {
		return () -> {};
	}
	
	@Bean
	public Runnable createRunnable2() {
		return () -> {};
	}
}
