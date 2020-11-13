package org.catmanscodes.dao;

import org.springframework.stereotype.Component;

@Component
public class CatDaoImpl implements AnimalDao {

	@Override
	public void getAnimal() {
		System.out.println("Hi Cat Dao Impl Example");

	}

}
