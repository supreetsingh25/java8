package com.ashok.methodreference;
@FunctionalInterface 
interface MyInterface1{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
public class Constructor {  
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface1 ref = Hello::new;  
        ref.display("Hello World!");  
    }  
}