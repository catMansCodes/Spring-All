package org.catmanscodes.main;

import org.catmanscodes.config.AnimalConfig;
import org.catmanscodes.service.AnimalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class); 
		
		AnimalService animalService = context.getBean("animalServiceImpl",AnimalService.class);
		
		animalService.getAnimalDetails();
		
		context.close();
	}

}
