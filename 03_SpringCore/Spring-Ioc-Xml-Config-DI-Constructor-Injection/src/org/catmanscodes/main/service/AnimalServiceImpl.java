package org.catmanscodes.main.service;

import org.catmanscodes.main.dao.AnimalDao;

public class AnimalServiceImpl implements AnimalService {

	private AnimalDao animalDao;
	
	public AnimalServiceImpl(AnimalDao animalDao) {
		super();
		this.animalDao = animalDao;
	}

	@Override
	public void getAnimal() {
		animalDao.getAnimal();
	}

}
