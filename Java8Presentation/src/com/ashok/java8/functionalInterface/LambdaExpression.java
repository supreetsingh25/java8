package com.ashok.java8.functionalInterface;

interface A{

	 String show(int i);
}

/*class Xyz implements A{


	public void show(int i) {
		
		System.out.println("Hello "+ i);
	}
	
	
}*/
public class LambdaExpression {

	public static void main(String[] args) {
		
		A obj;
		//obj=new Xyz();
		obj=new A() {
			public String show(int i) {
				System.out.println("Hello" + i);
				return "";
			}
		};
		
		obj=(int i)->{
			System.out.println("hello"+ i);
			return "";
		};
		
		obj=(i)->{return "dfsd";};
		
		//System.out.println(obj);
		
		
		
		
	
	}

}
