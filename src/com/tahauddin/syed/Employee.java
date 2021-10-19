package com.tahauddin.syed;
/**
 * @author Syed Tahauddin
 *
 */
public class Employee {
	
	private Employee() {
		System.out.println("0-Param Constructor Called..");
	}
	
	/**
	 *  this is lazy instantiazation
	 *  whenever we call getInstance() then only object will be created
	 *  
	 */
	private static Employee INSTANCE;
	
	/*
	 * this is called eager instantiazation 
	 * when the class is loaded by jvm then employee object will be created
	 * even if we don't ask for it.
	 * 
	 * private static Employee INSTANCE2 = new Employee();
	 * 
	 * public static Employee getInstance2() {
	 *  return INSTANCE2; 
	 *  }
	 */

	public static Employee getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Employee();
		}
		return INSTANCE;
	}

}
