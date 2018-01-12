package com.ahok.optional.demo;

public interface i {
	
	void m1();

}

class C1 implements i{
	public void m1() {
		
	}
}

class c2{
	public static void main(String args[]) {
		i i = new i() {
			public void m1() {
				
			}
		};
	}
}
