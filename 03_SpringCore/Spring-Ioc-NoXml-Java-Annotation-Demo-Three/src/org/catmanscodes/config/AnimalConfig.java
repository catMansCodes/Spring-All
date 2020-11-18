package org.catmanscodes.config;

import org.catmanscodes.service.AnimalService;
import org.catmanscodes.service.AnimalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AnimalConfig {

	@Bean
	public AnimalService animalServiceImpl() {
		return new AnimalServiceImpl();
	}
}
