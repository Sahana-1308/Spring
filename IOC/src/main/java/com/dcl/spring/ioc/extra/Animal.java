package com.dcl.spring.ioc.extra;

import org.springframework.stereotype.Component;

@Component
public class Animal {
	public Animal() {
		System.out.println("Animal Object Created");
	}
}
