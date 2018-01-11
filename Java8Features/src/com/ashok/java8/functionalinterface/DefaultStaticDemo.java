/**
 * 
 */
package com.ashok.java8.functionalinterface;

/**
 * @author Supreet
 *
 */
public class DefaultStaticDemo extends ClassA implements InterfaceA{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultStaticDemo b = new DefaultStaticDemo();
		b.show();
		
		InterfaceA.showStatic();

	}

}
