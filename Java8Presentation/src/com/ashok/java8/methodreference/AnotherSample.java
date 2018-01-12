/**
 * 
 */
package com.ashok.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*interface Selector{
	public boolean pick(int value);
}*/
/*
class EvenSelector implements Selector{
	@Override
	public boolean pick(int value) {
		return value % 2 == 0;
	}
	
}*/
/**
 * @author Supreet
 *
 */
public class AnotherSample {
	
	/*public static int totalValues(List<Integer> numbers, Selector selector) {
		int result = 0;
		for(int e : numbers) {
			if(selector.pick(e)) result += e;
		}
		return result;
	}*/
	
	public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
		/*int result = 0;
		for(int e : numbers) {
			if(selector.test(e)) result += e;
		}
		return result;*/
		return numbers.stream()
				.filter(selector)
				.reduce(0, Math::addExact);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
		
		System.out.println(totalValues(values, e -> true));
		System.out.println(totalValues(values, e -> e % 2 ==0));
		
		//mixing object composition + function composition
	}

}
