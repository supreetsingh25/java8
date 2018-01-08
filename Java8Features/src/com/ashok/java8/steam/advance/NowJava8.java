package com.ashok.java8.steam.advance;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class NowJava8 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("ashok", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()                        // Convert to steam
                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null); 
        
        // If not found, return null

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);
        
        Person result3 = persons.stream()
                .filter(NowJava8::isEqualToJack)
                .findAny()
                .orElse(null);

        System.out.println(result3);
        
        Predicate<Person> isEqualToJack = person -> "jack".equals(person.getName());
        
        Person result4 = persons.stream()
                .filter(isEqualToJack)
                .findAny()
                .orElse(null);

        System.out.println(result4);
        
        Function<String, Predicate<Person>> isEqualTo = pivot -> person -> pivot.equals(person.getName());
        
        Person result5 = persons.stream()
                .filter(isEqualTo.apply("supreet"))
                .findAny()
                .orElse(null);

        System.out.println(result5);
        
    }
    
    public static boolean isEqualToJack(Person person) {
    	return "jack".equals(person.getName());
    }

}