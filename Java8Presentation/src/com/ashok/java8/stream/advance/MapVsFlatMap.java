package com.ashok.java8.stream.advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		
		List<Integer> integerList=Arrays.asList(1,3,5,7);
		integerList.stream().map(x->x+10).collect(Collectors.toList()).forEach(System.out::println);
		
		List<List<String>> listofWords=Arrays.asList(Arrays.asList("Hello","Word"),
				Arrays.asList("How","Are","You"));
			
		listofWords.stream().flatMap(word->word.stream()).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println(" ");
		
		List<List<String>> listofListOfCities=Arrays.asList(Arrays.asList("Delhi","Mumbai"),
				Arrays.asList("Beijing","Shanghai","Tianjin"),
				Arrays.asList("Kathmandu","Lalitpur"),
				Arrays.asList("Thimphu","Phuntsholing"));
		
		List<String> listOfCitiesUppercase=listofListOfCities.stream()
				                              .flatMap(citiesByCountries -> citiesByCountries.stream())
				                              .filter(s -> s.startsWith("T"))
				                              .collect(Collectors.toList());
		listOfCitiesUppercase.forEach(System.out::println);
	}

}
