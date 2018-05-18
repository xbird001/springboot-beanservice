package com.springcore.bean;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("��������Ŀ��Jar--Spring������ʼ����Bean�ĸ���:" + applicationContext.getBeanDefinitionCount());
	}

}
