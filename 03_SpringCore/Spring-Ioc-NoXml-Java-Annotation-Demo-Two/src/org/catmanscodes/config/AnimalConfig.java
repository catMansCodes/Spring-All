package org.catmanscodes.config;

import org.catmanscodes.dao.AnimalDao;
import org.catmanscodes.dao.AnimalDaoImpl;
import org.catmanscodes.service.AnimalService;
import org.catmanscodes.service.AnimalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {

	@Bean
	public AnimalDao animalDaoImpl() {
		return new AnimalDaoImpl();
	} 
	
	@Bean
	public AnimalService animalServiceImpl() {
		return new AnimalServiceImpl(animalDaoImpl());
	}
	
	
}
