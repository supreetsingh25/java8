package com.ashok.methodreference;
@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class ExampleInstanceMethod {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
	ExampleInstanceMethod obj = new ExampleInstanceMethod();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}