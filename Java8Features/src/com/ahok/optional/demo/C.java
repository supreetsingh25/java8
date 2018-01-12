package com.ahok.optional.demo;

public interface C extends A{
	default void show() {
		System.out.println("C");
	}

}
