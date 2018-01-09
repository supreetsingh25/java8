package com.ashok.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReferenceToStaticMethodExample {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16);
        List<Integer> primeNumbers = ReferenceToStaticMethodExample.findPrimeNumbers(numbers, 
        		(number) -> ReferenceToStaticMethodExample.isPrime((int) number));// Lambda Expression
        
        
        List<Integer> primeNumbers1 = ReferenceToStaticMethodExample.findPrimeNumbers(numbers, 
        		ReferenceToStaticMethodExample::isPrime); // Method Reference
 
        System.out.println("Prime Numbers are " + primeNumbers);
        
        System.out.println("Prime Numbers1 are " + primeNumbers1);
    }
 
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) 
        { if (number % i == 0) { 
        	return false; }
        
        } 
        	return true; 
       }
    
    
    public static List<Integer> findPrimeNumbers(List<Integer> list, Predicate<Integer> predicate) { 
    	List<Integer> primeNumbers = new ArrayList<>(); 
    	list.stream().filter((i) -> (predicate.test(i))).forEach((i) -> {
            primeNumbers.add(i);
        });
        return primeNumbers;
 
    }
}