package com.ashok.functionandpredicate;
import java.util.function.Predicate;  

public class PredicateInterfaceExample {  
    static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
    public static void main(String[] args){  
        // Using Predicate interface  
        Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;  
        // Calling Predicate method  
        System.out.println(predicate.test(25));  
    }  
}  