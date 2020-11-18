package org.catmanscodes.service;

import org.catmanscodes.dao.AnimalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalDao animalDao;
	
	public AnimalServiceImpl(AnimalDao animalDaoImpl) {
		// no arg constructor for bean configuration
	}

	@Override
	public void getAnimalDetails() {
		animalDao.getAnimalDetails();
	}

}
