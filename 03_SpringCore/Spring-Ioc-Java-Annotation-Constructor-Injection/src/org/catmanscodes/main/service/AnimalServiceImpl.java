package org.catmanscodes.main.service;

import org.catmanscodes.dao.AnimalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {

	
	private AnimalDao animalDao;

	@Autowired
	public AnimalServiceImpl(AnimalDao animalDao) {
		super();
		this.animalDao = animalDao;
	}

	@Override
	public void getAnimal() {
		animalDao.getAnimal();
	}

}
