package com.Spring.SpringAnnotation;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Spring.SpringAnnotation")
public class AppConfig {
	
	//Annotation Based Bean Configuration
	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public MobileProcessor getProcess() { return new SnapDragon(); }
	 */
	
	
}
