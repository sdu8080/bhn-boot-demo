package com.bhn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * this bean is to get the command line arguments and use it in the business logic
 *
 */
@Component
public class CommandBean implements CommandLineRunner {
	
	static Logger logger = LoggerFactory.getLogger(CommandBean.class);

    public void run(String... args) {
    	if(args!=null){
    		for(String s:args){
    			logger.info("-->"+s);
    		}
    	}
    }

}