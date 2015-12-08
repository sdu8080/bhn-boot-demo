package com.bhn;

import org.h2.server.web.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;



/**
 * Spring Boot application initial entry class.
 * @author sdu0000
 *
 */
@SpringBootApplication
//@ComponentScan("commands, com.bhn")
public class BootstrapApplication extends SpringBootServletInitializer{
	
	static Logger logger = LoggerFactory.getLogger(BootstrapApplication.class);

	/* entry point for stand alone application */
    /*public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(BootstrapApplication.class);
        app.run(args);
    }*/
    
    
    /* entry point for Servlet 3.0 application */  
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	return application.sources(BootstrapApplication.class); 
	}
    
    /* register H2 servlet with URL mapping to /console/ */
    @Bean
	public ServletRegistrationBean h2servletRegistration() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	    registration.addUrlMappings("/console/*"); 
	    return registration;
	}
    
    

}



