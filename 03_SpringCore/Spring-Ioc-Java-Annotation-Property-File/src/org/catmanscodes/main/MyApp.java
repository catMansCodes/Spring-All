package org.catmanscodes.main;

import org.catmanscodes.main.service.AnimalService;
import org.catmanscodes.main.service.AnimalServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		AnimalService animalService = context.getBean("animalServiceImpl", AnimalService.class);
		animalService.getAnimal();
		
		AnimalServiceImpl animalServiceDetails = context.getBean("animalServiceImpl", AnimalServiceImpl.class);
		
		System.out.println("Animal Type : "+animalServiceDetails.getAnimalType());
		System.out.println("Animal Name : "+animalServiceDetails.getAnimalName());
		
		context.close();
	}

}
