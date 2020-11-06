package org.catmanscode.config;

import org.catmanscode.service.AnimalService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCOntext.xml");
		
		AnimalService service = context.getBean("serviceBean",AnimalService.class);
		
		service.getAnimal();
		
		context.close();
	}

}
