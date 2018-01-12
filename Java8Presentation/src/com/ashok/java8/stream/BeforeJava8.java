package com.ashok.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "ashok");
        List<String> result = getFilterOutput(lines, "ashok");
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"ashok".equals(line)) { // we dont like ashok
                result.add(line);
            }
        }
        return result;
    }

}