package com.bhn.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * This class is to show how to use environment variable or application property to 
 * load from different application properties file
 *  
 * @author sdu0000
 *
 */
@Component
public class PropertyBean {
	
	
	static Logger logger = LoggerFactory.getLogger(PropertyBean.class);
	
	@Value("${environment.name}")
    private String name;
	
	@PostConstruct
	public void init(){
		logger.info("******Environment******:{"+name+"}");
	}
	
	public String getName(){
		return name;
	}
}
