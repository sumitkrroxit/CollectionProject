/**
 * 
 */
package org.collection.test;

import java.util.Date;

/**
 * @author Spiderwings
 *
 */
public class Showroom {

	/**
	 * 
	 */
	public Showroom() {
		System.out.println("Constructor Showroom:");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(new Date());
		Factory f1 = new Factory();
			f1.FactoryDisplay();
	}

}
