/**
 * 
 */
package com.ashok.java8.functionalinterface;

/**
 * @author Supreet
 *
 */
public interface InterfaceB {
//void add();
	
	default void show() {
		System.out.println("IB");
	}
}
