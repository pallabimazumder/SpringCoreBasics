package com.Spring.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Annotation Based Bean Configuration
@Component
public class Car implements Vehicle{
	
	@Autowired
	private Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void drive() {
		System.out.println("Car "+tyre);
	}
}
