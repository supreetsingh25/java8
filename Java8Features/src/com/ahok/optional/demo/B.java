package com.ahok.optional.demo;

public interface B extends A{
	default void show() {
		System.out.println("B");
	}
}
