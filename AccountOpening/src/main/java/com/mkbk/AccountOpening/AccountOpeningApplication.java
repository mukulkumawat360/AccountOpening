package com.mkbk.AccountOpening;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AccountOpeningApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountOpeningApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfiguror() {
		
		return new WebMvcConfigurer() {
			
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedMethods("*")
				.allowedOrigins("http://localhost:3000/");
			}
		};
	}
	

}
