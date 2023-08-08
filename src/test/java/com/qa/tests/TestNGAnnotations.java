package com.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Video;

public class TestNGAnnotations {
	
	@BeforeMethod
	public void test1() {
		System.out.println("Before Method is called");
	}
	
	@AfterMethod
	public void test2() {
		System.out.println("After Method is called");
	}
	
//	@Test
//	public void testMain1() {
//		System.out.println("Test script1 is executed");
//	}
//	
//	@Test
//	public void testMain2() {
//		System.out.println("Test script2 is executed");
//	}
	
	@BeforeClass
	public void test3() {
		System.out.println("Before class is called");
	}
	
	@AfterClass
	public void test4() {
		System.out.println("After class is called");
	}
	
	@BeforeTest
	public void test5() {
		System.out.println("Before test is called");
	}
	
	@AfterTest
	public void test6() {
		System.out.println("After test is called");
	}
	
	@BeforeSuite
	public void test7() {
		System.out.println("Before Suite is called");
	}
	
	@AfterSuite
	public void test8() {
		System.out.println("After Suite is called");
	}
}
