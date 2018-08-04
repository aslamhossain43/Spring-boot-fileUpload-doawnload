package com.renu.SpringbootfileUpload_doawnload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.renu.SpringbootfileUpload_doawnload.property.FileStorageProperties;

@Configuration
public class Config {

	 @Bean
	    public FileStorageProperties fileStorageProperties() {
	    	
	    	
	    	return new FileStorageProperties();
	    }
	
}
