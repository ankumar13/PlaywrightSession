package com.qa.tests;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test(priority = 1, groups = "smoke")
	public void registerUser( ) {
		System.out.println("User is registering");
	}
	
	@Test(priority = 2, groups = "regression")
	public void loginUser( ) {
		System.out.println("User is logging in");
	}
	
	@Test(priority = 3, groups = "bvt")
	public void purchase( ) {
		System.out.println("User is doing purchase");
	}
	
	@Test(priority = 4, groups = {"smoke", "regression", "bvt"})
	public void logout( ) {
		System.out.println("User is logging out from application");
	}
	
}
