/**
 * 
 */
package com.ashok.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Supreet
 *
 */
public class PredicateSample {
	
	public static boolean isGreaterThan3(int number) {
		System.out.println("isGreaterThan3 "+number);
		return number > 3;
	}
	
	public static boolean isEven(int number) {
		System.out.println("isEven "+number);
		return number % 2 == 0;
	}
	
	public static int doubleIt(int number) {
		System.out.println("doubleIt "+number);
		return number * 2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
		//find the double of the first even number greater than 3
		
		
		Stream<Integer> temp2 = values.stream()
		.filter(PredicateSample::isGreaterThan3)
		.filter(PredicateSample::isEven)
		.map(PredicateSample::doubleIt);
		
		System.out.println(temp2);
		
		Stream<Integer> temp1 = values.stream()
				.filter(e -> isGreaterThan3(e)) // office space pattern
				.filter(PredicateSample::isEven)
				.map(PredicateSample::doubleIt);
		
		Predicate<Integer> isGreaterThan3 = number -> number > 3;
		
		
		Stream<Integer> temp = values.stream()
				.filter(isGreaterThan3)
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2);
		
		Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;
		
		Stream<Integer> temp3 = values.stream()
				.filter(isGreaterThan.apply(4))
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2);
		
		//System.out.println(temp.findFirst());

	}

}
