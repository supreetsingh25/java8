package com.ashok.java8.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {

	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(9,4,2,26,32,2,4534,2423,23,23,56,1,5,6,6,3,4,5);
		// Normal Style to loop list
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		// External iterator
		for(int i:list) {
			
			System.out.println(i);
		}
		
		System.out.println();
		
		// Internal Iterator
		list.forEach(i->System.out.println(i));
		
		
		//Normal way to loop a Map
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		// In Java 8, you can loop a Map with forEach + lambda expression
		
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
		
		
		List<String> itemsList = new ArrayList<>();
		itemsList.add("A");
		itemsList.add("B");
		itemsList.add("C");
		itemsList.add("D");
		itemsList.add("E");

		//lambda
		//Output : A,B,C,D,E
		itemsList.forEach(item->System.out.println(item));

		//Output : C
		itemsList.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});

		//method reference
		//Output : A,B,C,D,E
		itemsList.forEach(System.out::println);

		//Stream and filter
		//Output : B
		itemsList.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
		
}
	
}
