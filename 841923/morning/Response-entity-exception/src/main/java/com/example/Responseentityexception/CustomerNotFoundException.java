package com.example.Responseentityexception;

public class CustomerNotFoundException extends Exception{

	public CustomerNotFoundException() {
		super("cutomer not found");

	}
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
