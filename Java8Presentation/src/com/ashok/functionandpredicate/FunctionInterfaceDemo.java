package com.ashok.functionandpredicate;
import java.util.function.Function;
 
public class FunctionInterfaceDemo {
 
    public static void main(String[] args) {
        
        Function<String, Integer> length = str -> str.length();
        
        System.out.println("Length of string 'Hello World' is " + length.apply("Hello World"));
 
    }
 
}