package org.catmanscodes.service;

import org.catmanscodes.dao.AnimalDao;

public class AnimalServiceImpl implements AnimalService{
	
	private AnimalDao animalDao;
	
	private String animalType;
	
	private String animalName;
	
	public void setAnimalDao(AnimalDao animalDao) {
		this.animalDao = animalDao;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	@Override
	public void getAnimal() {
		animalDao.getAnimal();
	}

}
