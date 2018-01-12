package com.ahok.optional.prerequisite;

public interface C extends A{
	default void show() {
		System.out.println("C");
	}

}
