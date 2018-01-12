package com.ashok.java8.functionalprogramming;

interface A{

	void show(int i);
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
		/*obj=new A() {
			public void show(int i) {
				System.out.println("Hello" + i);
			}
		};*/
		
		/*obj=(int i)->{
			System.out.println("hello"+ i);
		};*/
		
		obj=(i)->System.out.println("hello" + i);
		
		obj.show(8);
		
		
		
	
	}

}
