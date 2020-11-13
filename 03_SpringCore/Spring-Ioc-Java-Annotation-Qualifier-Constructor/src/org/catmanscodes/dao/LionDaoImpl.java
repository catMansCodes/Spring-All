package org.catmanscodes.dao;

import org.springframework.stereotype.Component;

@Component
public class LionDaoImpl implements AnimalDao {

	@Override
	public void getAnimal() {
		System.out.println("Hi Cat Lion Impl Example");
	}

}
