package com.ashok.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {

		System.out.println(t);
	}
	
}

public class ConsumerExample {

	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(9,4,2,6,6,3,4,5);
		
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
