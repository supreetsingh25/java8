package com.ashok.java8;

import java.util.Arrays;
import java.util.List;

interface Parser{
	
	String parse(String str);
}

class StringParser {
	
	public static String convert(String str) {
		
		if(str.length()<=3)
			str=str.toUpperCase();
		else
			str=str.toLowerCase();
		return str;
	}
	
}

class MyPrinter{
	
	public void print(String str,Parser p) {
		str=p.parse(str);
		System.out.println(str);
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		/*
		List<String> names=Arrays.asList("Navin","Pinto","Sameer","Aayat");
		
		names.forEach(s->System.out.println(s)); // Lambda Expression
		
		names.forEach(System.out::println);// Method Reference 
*/		
		String str="Ashok Singh";
		MyPrinter myPrinter=new MyPrinter();
		//myPrinter.print(str);
		
		myPrinter.print(str, new Parser() {
			public String parse(String str) {
				return StringParser.convert(str);
			}
		});
		
		
		myPrinter.print(str, s->StringParser.convert(s)); // Lambda Expresion
		
		myPrinter.print(str, StringParser::convert); // Method Reference
	}

}
