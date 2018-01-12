package com.ashok.java8.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {

		System.out.println(t);
	}
	
}

public class ConsumerExample {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(9,4,2,6,6,3,4,5);
		
		int sum = 0;
		for(int i : list) {
			sum += i;
		}
		//System.out.println(sum);
		
		/*System.out.println(list.stream().reduce(0, Integer::sum));
		
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println(list.stream().collect(Collectors.summingInt(Integer::intValue)).intValue());*/
		
		Consumer<Integer> c=new  ConsumerImpl();
		list.forEach(c);
		
		System.out.println("------------------------");
		Consumer<Integer> c1=new Consumer<Integer>() { // anonymous inner class
			@Override
			public void accept(Integer t) {
				System.out.println(t);		
			}
		};
		list.forEach(c1);
		
		System.out.println("------------------------");
		
		Consumer<Integer> c2=(i)->{
			System.out.println(i);
		};
		list.forEach(c2);
		
		System.out.println("------------------------");
		
		
		// Internal Iterator
		list.forEach(i->System.out.println(i));
		
	}

}
