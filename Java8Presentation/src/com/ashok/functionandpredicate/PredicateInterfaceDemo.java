package com.ashok.functionandpredicate;
import java.util.function.Predicate;
 
public class PredicateInterfaceDemo {
 
    public static void main(String[] args) {
        
        int num = -10;
 
        Predicate<Integer> gt_lt = i -> i >= 0 ;
 
        boolean result = gt_lt.test(num);
        
        System.out.println(num + " greater than zero : "+ result);
    }
 
}