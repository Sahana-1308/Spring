package com.dcl.spring.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public Student() {
		System.out.println("Student object created");
	}
	public void learn() {
		System.out.println("Learning Spring");
	}
}
