package com.ashok.java8;

import java.util.Arrays;
import java.util.List;

interface Parser1{
	
	String parse(String str);
}

class StringParser1 {
	
	public String convert(String str) {
		
		if(str.length()<=3)
			str=str.toUpperCase();
		else
			str=str.toLowerCase();
		return str;
	}
	
	public String show(String str) {
		return str;
	}
}

class MyPrinter1{
	
	public void print(String str,Parser1 p) {
		str=p.parse(str);
		System.out.println(str);
	}

	public void print(String str, Object p) {
		// TODO Auto-generated method stub
		
	}
}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		
		/*
		List<String> names=Arrays.asList("Navin","Pinto","Sameer","Aayat");
		
		names.forEach(s->System.out.println(s)); // Lambda Expression
		
		names.forEach(System.out::println);// Method Reference 
*/		
		String str="Ashok Singh";
		MyPrinter1 myPrinter=new MyPrinter1();
		
		StringParser1 sp=new StringParser1();// For instance method
		
		myPrinter.print(str, new Parser1() {
			public String parse(String str) {
				return sp.convert(str);
			}
		});
		
		
		myPrinter.print(str, s->sp.convert(s)); // Lambda Expresion
		
		myPrinter.print(str, sp::convert); // Method Reference
		
		myPrinter.print(str, sp::show);
	}

}
