package com.ashok.java8.methodreference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArbitaryObject {  

   public static void main(String[] args) {  
	List<String> stringArray = Arrays.asList("Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon");
	/* Method reference to an instance method of an arbitrary 
	 * object of a particular type
	 */
	Collections.sort(stringArray, String::compareToIgnoreCase);
	stringArray.forEach(System.out::println);
	
	//stringArray.stream().sorted().forEach(System.out::println);
	
   }  
}