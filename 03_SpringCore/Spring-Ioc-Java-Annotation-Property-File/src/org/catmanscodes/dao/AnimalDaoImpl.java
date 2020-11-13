package org.catmanscodes.dao;

import org.springframework.stereotype.Component;

@Component
public class AnimalDaoImpl implements AnimalDao {

	@Override
	public void getAnimal() {
		System.out.println("Hi Animal peoperty Example");
	}

}
