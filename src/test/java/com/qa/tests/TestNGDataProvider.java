package com.qa.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@Test(dataProvider = "browserData")
	public void testMain(String browserName) {
		System.out.println("Script code executed on browser" +browserName);
	}
	
	@DataProvider
	public Object[][] browserData() {
		return new Object [][] {
			{"chromium"},
			{"firefox"},
			{"chrome"}
		};
	}

}
