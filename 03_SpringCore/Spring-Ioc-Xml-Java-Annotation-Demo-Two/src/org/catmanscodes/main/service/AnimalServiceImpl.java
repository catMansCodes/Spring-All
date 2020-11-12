package org.catmanscodes.main.service;

import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {

	@Override
	public void getAnimal() {
		System.out.println("Hello Spring Bean Java Annotation example");
	}

}
