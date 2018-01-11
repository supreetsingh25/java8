/**
 * 
 */
package com.ashok.java8.functionalinterface;

/**
 * @author Supreet
 *
 */
public interface InterfaceA {
	
	//void add();
	
	default void show() {
		System.out.println("IA");
	}

	static void showStatic() {
		System.out.println("I am show static");
	}
}
