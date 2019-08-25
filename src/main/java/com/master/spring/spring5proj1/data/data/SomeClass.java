package com.master.spring.spring5proj1.data.data;

public class SomeClass {

	/*
	 * A normal class can not be intercepted .. aspects only intercept beans.
	 */
	public String saySomething() {
		return "SomeClass";
	}
}
