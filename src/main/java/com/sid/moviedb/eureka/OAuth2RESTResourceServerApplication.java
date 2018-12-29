package com.sid.moviedb.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan("com.sid.moviedb.*")
public class OAuth2RESTResourceServerApplication {

    public static void main(String[] args) {
	SpringApplication.run(OAuth2RESTResourceServerApplication.class, args);
    }

}
