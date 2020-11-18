package org.catmanscodes.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {

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


}
