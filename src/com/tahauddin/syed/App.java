package com.tahauddin.syed;

public class App {

	public static void main(String[] args) {

		Employee instance = Employee.getInstance();
		Employee instance2 = Employee.getInstance();
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println("instance1==instance2 " + (instance == instance2));
	}

}
