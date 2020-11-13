package org.catmanscodes.main;

import org.catmanscodes.main.service.AnimalService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		AnimalService animalService1 = context.getBean("animalServiceImpl", AnimalService.class);

		AnimalService animalService2 = context.getBean("animalServiceImpl", AnimalService.class);
		
		System.out.println("animalService1 ==> " +animalService1);
		System.out.println("animalService2 ==> " +animalService2);
		
		
		if(animalService1 == animalService2) {
			System.out.println("Inside If because it's singleton ");
		}else {
			System.out.println("Inside else because it's prototype so each time creat new object ");
		}
		
		animalService1.getAnimal();
		animalService2.getAnimal();
		
		context.close();
	}

}
