package com.ashok.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * The Class ReferenceToInstanceMethodAOPT.
 */
public class ReferenceToInstanceMethodAOPT {
 
    /**
     * The Class Person.
     */
 
     private static class Person {
 
            /** The name. */
            private final String name;
            
            /** The age. */
            private final int age;
 
 
            /**
             * Instantiates a new person.
             *
             * @param name the name
             * @param age the age
             */
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
 
            }
 
            /**
             * Gets the name.
             *
             * @return the name
             */
            public String getName() {
                return name;
            }
 
            /**
             * Gets the age.
             *
             * @return the age
             */
            public int getAge() {
                return age;
            }
 
 
        }
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> persons = new ArrayList<>();
            persons.add(new Person("Albert", 80));
            persons.add(new Person("Ben", 15));
            persons.add(new Person("Charlote", 20));
            persons.add(new Person("Dean", 6));
            persons.add(new Person("Elaine", 17));
 
 
            List<Integer> allAges = ReferenceToInstanceMethodAOPT.listAllAges(persons, Person::getAge);
            System.out.println("Printing out all ages \n"+allAges);
    }
 
 
    /**
     * List all ages.
     *
     * @param person the person
     * @param f the f
     * @return the list
     */
    private static List<Integer> listAllAges(List<Person> person, Function<Person, Integer> f){
        List<Integer> result = new ArrayList<>();
        person.forEach(x -> result.add(f.apply((Person)x)));
        return result;
    }
}