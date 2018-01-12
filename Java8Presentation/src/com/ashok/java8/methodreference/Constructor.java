package com.ashok.java8.methodreference;

@FunctionalInterface 
interface MyInterface1{  
    Hello display(String say);  
}  

class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  

/**
 * The Class Constructor.
 */
public class Constructor {  
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface1 ref = Hello::new;  
        ref.display("Hello World to Java 8!");  
    }  
}