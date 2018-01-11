package com.ashok.java8.functionalinterface;

interface A{

	void show();
}

/*class Xyz implements A{


	public void show() {
		
		System.out.println("Hello");
	}
	
	
}*/
public class LambdaExpression {

	public static void main(String[] args) {
		
		A obj;
		//=new Xyz();
		/*obj=new A() {
			public void show() {
				System.out.println("Hello");
			}
		};
		*/
		obj=()->{
			System.out.println("Hello");
		};
		
	//	obj=()->System.out.println("hello");
		
		obj.show();
		
		
		
	
	}

}
