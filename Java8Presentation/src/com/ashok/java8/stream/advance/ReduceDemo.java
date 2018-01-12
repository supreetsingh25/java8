package com.ashok.java8.stream.advance;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
				
				//Reduce Array to sum.
				int[] array = {30, 10, 20, 40};
				int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
				System.out.println("Sum of Array: "+ sum);
				
				//Reduce List to sum.
				List<Integer> list = Arrays.asList(30, 10, 20, 40);
				sum = list.stream().reduce(0, (x, y) -> x + y);
				System.out.println("Sum of List: "+ sum);	
				
				//Reduce Array to String.
				String[] array1 = {"Mohan", "Sohan", "Mahesh"};
				Arrays.stream(array1).reduce((x, y) -> x +"," + y)
				       .ifPresent(s -> System.out.println("Array to String: "+ s));
				//Reduce List to String.
				List<String> list1 = Arrays.asList("Mohan", "Sohan", "Mahesh");
				list1.stream().reduce((x, y) -> x +"," + y)
					       .ifPresent(s -> System.out.println("List to String: "+ s));

	}

}
