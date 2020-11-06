package org.catmanscode.service;

import org.catmanscode.dao.AnimalDao;

public class AnimalServiceImpl implements AnimalService {

	
	private AnimalDao animalDao1;
	
	public void setAnimalDao(AnimalDao animalDao2) {
		this.animalDao1 = animalDao2;
	}


	@Override
	public void getAnimal() {
		animalDao1.getAnimal();
	}

}
