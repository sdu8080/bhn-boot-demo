package com.bhn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Service namespace will allow auto injection of applicationContext without using
 * {@link ApplicationContextAware}
 * 
 * @author sdu0000
 *
 */
@Service
public class ContextProxy {

	private static ApplicationContext context;

	@Autowired
	public void context(ApplicationContext context) {
		ContextProxy.context = context;
	}
	
	public static Object getBean(String beanName){
		return context.getBean(beanName);
	}
	
	
}
