package com.qa.tests;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;

public class TestNGTest {

	Boolean isuserRegistered = false;
	
	@Test(enabled = false)
	public void registerUser( ) {
		System.out.println("User is registering");
	}
	
	@Test
	public void loginUser( ) {
		if(isuserRegistered)
		{
		System.out.println("User is logging in");
		}else {
			throw new SkipException("User should register first");
		}
	}
	
	@Test
	public void purchase( ) {
		System.out.println("User is doing purchase");
	}
}
