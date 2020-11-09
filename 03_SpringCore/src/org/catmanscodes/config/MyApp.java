package org.catmanscodes.config;

import org.catmanscodes.service.AnimalService;
import org.catmanscodes.service.AnimalServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnimalService myAnimal = context.getBean("animalService",AnimalService.class);
		myAnimal.getAnimal();
		
		AnimalServiceImpl myAnimalSI = context.getBean("animalService",AnimalServiceImpl.class);
		
		System.out.println(myAnimalSI.getAnimalType());
		System.out.println(myAnimalSI.getAnimalName());
		
		context.close();
	}

}
