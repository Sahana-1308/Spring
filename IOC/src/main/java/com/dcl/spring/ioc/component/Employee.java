package com.dcl.spring.ioc.component;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public Employee() {
		System.out.println("Employee object Created");
	}
}
