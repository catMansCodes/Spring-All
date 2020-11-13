package org.catmanscodes.main.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {

	// init method
	@PostConstruct
	public void init() {
		System.out.println("Called Init Method");
	}
	
	@Override
	public void getAnimal() {
		System.out.println("Hello Spring Bean lifecycle example");
	}
	
	// destroy method
	@PreDestroy
	public void destroy() {
		System.out.println("Called destroy Method");
	}
}
