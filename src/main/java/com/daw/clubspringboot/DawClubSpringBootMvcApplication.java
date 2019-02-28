package com.daw.clubspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DawClubSpringBootMvcApplication extends SpringBootServletInitializer{

     @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DawClubSpringBootMvcApplication.class);
    }

    
	public static void main(String[] args) {
		SpringApplication.run(DawClubSpringBootMvcApplication.class, args);
	}

}
