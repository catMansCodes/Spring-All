package org.catmanscodes.main.service;

import org.catmanscodes.dao.AnimalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {

	
	private AnimalDao animalDao;

	@Autowired
	public AnimalServiceImpl(@Qualifier("catDaoImpl")AnimalDao animalDao) {
		super();
		this.animalDao = animalDao;
	}


	@Override
	public void getAnimal() {
		animalDao.getAnimal();
	}

}
