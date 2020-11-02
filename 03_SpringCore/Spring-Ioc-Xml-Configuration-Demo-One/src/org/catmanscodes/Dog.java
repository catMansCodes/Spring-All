package org.catmanscodes;

/**
 * The <code>Dog</code> is implementation of Animal class.
 * 
 * @author catman's Code
 *
 */
public class Dog implements Animal {

	/*
	 * (non-Javadoc)
	 * @see org.catmanscodes.Animal#getFavouriteAnimal()
	 */
	@Override
	public void getFavouriteAnimal() {
		System.out.println("Dog is my favourite animal");
	}

}
