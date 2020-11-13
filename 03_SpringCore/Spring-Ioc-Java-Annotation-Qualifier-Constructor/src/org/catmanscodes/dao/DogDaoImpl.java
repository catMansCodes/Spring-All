package org.catmanscodes.dao;

import org.springframework.stereotype.Component;

@Component
public class DogDaoImpl implements AnimalDao {

	@Override
	public void getAnimal() {
		System.out.println("Hi Dog Dao Impl Example");
	}

}
