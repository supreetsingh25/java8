package com.ashok.java8.methodreference;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  

/**
 * The Class ExampleInstanceMethod.
 */
public class ExampleInstanceMethod {  
    
    /**
     * My method.
     */
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {  
	ExampleInstanceMethod obj = new ExampleInstanceMethod();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}