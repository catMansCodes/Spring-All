package org.catmanscodes.main.service;

public class AnimalServiceImpl implements AnimalService {

	// init method
	
	public void init() {
		System.out.println("Called Init Method");
	}
	
	@Override
	public void getAnimal() {
		System.out.println("Hello Spring Bean lifecycle example");
	}

	
	// destroy method
	public void destroy() {
		System.out.println("Called destroy Method");
	}
}
