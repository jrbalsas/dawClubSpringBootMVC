package com.daw.clubspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/** SpringBoot configuration class for deploying in JEE application server
 *
 * @author jrbalsas
 */
@SpringBootApplication
public class DawClubSpringBootMvcApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DawClubSpringBootMvcApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DawClubSpringBootMvcApplication.class, args);
    }

}
