package org.catmanscodes.main;

import org.catmanscodes.config.AnimalConfig;
import org.catmanscodes.service.AnimalServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class); 
		
		AnimalServiceImpl animalServiceimpl = context.getBean("animalServiceImpl",AnimalServiceImpl.class);
		
		System.out.println(animalServiceimpl.getAnimalType());
		System.out.println(animalServiceimpl.getAnimalName());
		
		context.close();
	}

}
