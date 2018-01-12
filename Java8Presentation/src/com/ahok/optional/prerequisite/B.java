package com.ahok.optional.prerequisite;

public interface B extends A{
	default void show() {
		System.out.println("B");
	}
}
