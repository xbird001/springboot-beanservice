package com.springcore.bean;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("第三方项目或Jar--Spring容器初始化的Bean的个数:" + applicationContext.getBeanDefinitionCount());
	}

}
