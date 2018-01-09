package com.ashok.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReferenceToConstructor {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<Integer>  numbers = Arrays.asList(4,9,16,25,36);
         List<Integer> squaredNumbers = ReferenceToConstructor.findSquareRoot(numbers,Integer::new);
         System.out.println("Square root of numbers = "+squaredNumbers);
    }
    
    private static List findSquareRoot(List<Integer> list, Function<Integer,Integer> f){
        List<Double> result = new ArrayList<>();
        list.forEach(x -> result.add(Math.sqrt(f.apply((Integer) x))));
        return result;
    }
}