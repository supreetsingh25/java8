package com.ashok.java8.steam;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "ashok");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"ashok".equals(line))     // we dont like ashok
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

    }

}