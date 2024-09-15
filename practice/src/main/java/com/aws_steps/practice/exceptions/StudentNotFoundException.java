package com.aws_steps.practice.exceptions;


public class StudentNotFoundException extends RuntimeException{
	
	public StudentNotFoundException(String msg, StudentNotFoundException e) {
		super(msg, e);
	}

	public StudentNotFoundException(String msg) {
		super(msg);
	}

	
}
