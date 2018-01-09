package com.ashok.functionandpredicate;
import java.util.function.BiPredicate;

public class BiPredicateExample2 {
	
	
	public static void main(String[] args) {
		
		BiPredicate<Long, Long> predicate1 = (x, y) -> x > y;
		BiPredicate<Long, Long> predicate2 = (x, y) -> x == y;

		// Using and()
		System.out.println(predicate1.and(predicate2).test(5l, 5l));

		// Using or()
		System.out.println(predicate1.or(predicate2).test(6l, 5l));

		// Using negate()
		System.out.println(predicate1.negate().test(8l, 1l));
	}
}