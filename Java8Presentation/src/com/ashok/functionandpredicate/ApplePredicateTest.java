package com.ashok.functionandpredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplePredicateTest {

	public static void main(String[] args) {
		
			List<Apple> apples = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
					new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));
			
			ApplePredicates.filterApples(apples, ApplePredicates.isWeightAbove150()).forEach(System.out::println);
		
			//With java 8 lambda expressions, we can do it simply as below:
			ApplePredicates.filterApples(apples, apple -> {
				return apple.getWeight() >= 150;
			}).forEach(System.out::println);
			
			// if we don’t want to define our own method, we can also use the default filter method and write it as:
				
				apples.stream().filter(apple -> {
					return apple.getWeight() >= 150;
				}).collect(Collectors.toList()).forEach(System.out::println);
				
				/*Now we can apply the and() function if we want to get a predicate for apple to be green
				and weight above or equal to 150 grams.*/
				//default Predicate and(Predicate other)
				
				Predicate<Apple> andPredicate = ApplePredicates.isColorGreen().and(ApplePredicates.isWeightAbove150());
				apples.stream().filter(andPredicate).forEach(System.out::println);
				
				/*default Predicate negate()
				Returns a predicate that represents the logical negation of this predicate.
				Let’s say we want the Predicate to get apples that are not green. 
				We already have one predicate that checks for Apple to be green, so we can negate it.*/

				Predicate<Apple> negateExample = ApplePredicates.isColorGreen().negate();
				apples.stream().filter(negateExample).forEach(System.out::println);
				
				/*
				Evaluates this predicate for the given argument. In our case, we can pass 
				in an Apple object to check if this predicate returns true or false for that apple.*/

				Apple testApple = new Apple("green", 120.0);
				System.out.println(ApplePredicates.isColorGreen().test(testApple));
				System.out.println(ApplePredicates.isWeightAbove150().test(testApple));
				
				
			/*	Now, let’s say we have an Apple, which has standard color and weight. 
				Then we can get a Predicate, that will test if the given apple is standard or not.
				
				static Predicate isEqual(Object targetRef)
				*/

				Predicate<Apple> standardApplePredicate = Predicate.isEqual(new Apple("red", 150.0));

				Apple testApple1 = new Apple("green", 120.0);
				System.out.println(standardApplePredicate.test(testApple1));
				System.out.println(standardApplePredicate.test(new Apple("red", 150.0)));
	}

}
