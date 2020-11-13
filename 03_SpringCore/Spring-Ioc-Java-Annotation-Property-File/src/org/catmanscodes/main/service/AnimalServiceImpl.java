package org.catmanscodes.main.service;

import org.catmanscodes.dao.AnimalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalDao animalDao;

	@Value("${animal.animaltype}")
	private String animalType;
	
	@Value("${animal.animalname}")
	private String animalName;
	
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
