package org.catmanscodes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * The <code>MyApplication</code> is main class of this application.
 * 
 * @author catman's Code
 *
 */
public class MyApplication {

	/**
	 * The <code>main</code> is entry point of this application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// step 01 : load the spring configure file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// step 02: retrieve bean from spring container
		Animal cat = context.getBean("myCat", Animal.class);
		Animal dog = context.getBean("myDog", Animal.class);
		Animal lion = context.getBean("myLion", Animal.class);
		
		// step 03: call method of the bean
		
		cat.getFavouriteAnimal();
		dog.getFavouriteAnimal();
		lion.getFavouriteAnimal();
		
		//step 04: close the context
		context.close();
		
	}

}
