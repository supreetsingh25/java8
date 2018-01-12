/**
 * 
 */
package com.ashok.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Supreet
 *
 */
public class ParallelStreamSample {
	
	public static int doubleIt(int number) {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		return number * 2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		//Referential transparency
		/*System.out.println(numbers.stream()
				.mapToInt(OneMoreSample::doubleIt)
				.sum());*/
		
		System.out.println(numbers.parallelStream()
				.mapToInt(ParallelStreamSample::doubleIt)
				.sum());
	}

}
