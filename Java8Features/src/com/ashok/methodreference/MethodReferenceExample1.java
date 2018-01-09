package com.ashok.methodreference;
import java.util.Arrays;
import java.util.List;

//Reference to a static method
class EvenOddChecker {
   public static boolean isEven(int n) {
      return n % 2 == 0;
   }
}

public class MethodReferenceExample1 {

   public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(20, 10, 15, 24, 55, 47, 16, 87, 88);

      // Print even numbers using lambda expression
      numbers.stream().map((n) -> EvenOddChecker.isEven(n))
          .forEach((n) -> System.out.println(n));
      
      // Print even numbers using method references
      numbers.stream().map(EvenOddChecker::isEven)
         .forEach(System.out::println);
   }

}