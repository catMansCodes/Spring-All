package org.catmanscodes.main;

import org.catmanscodes.main.service.AnimalService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		AnimalService animalService = context.getBean("animalServiceImpl", AnimalService.class);

		animalService.getAnimal();
		
		context.close();
	}

}
