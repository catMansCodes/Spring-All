package org.catmanscodes.dao;

import org.springframework.stereotype.Component;

@Component
public class AnimalDaoImpl implements AnimalDao {

	@Override
	public void getAnimalDetails() {
		System.out.println("Animal Demo project Two using no xml");
	}

}
