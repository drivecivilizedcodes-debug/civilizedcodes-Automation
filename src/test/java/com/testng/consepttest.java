package com.testng;

import org.testng.annotations.Test;

public class consepttest {
	
	@Test(priority=3)
	public void SignOut() {		
		System.out.println("Signout done");		
	}
	@Test(invocationCount = 4)
	public void Signup() {		
		System.out.println("Signup done");		
	}
	@Test(priority=1)
	public void login() {		
		System.out.println("Login done");		
	}
	@Test(priority=2)
	public void cart() {		
		System.out.println("Searching in cart");		
	}
	@Test
	public void find() {		
		System.out.println("find the object is done");	
	}



}
