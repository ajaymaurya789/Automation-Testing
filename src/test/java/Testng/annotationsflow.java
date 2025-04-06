package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationsflow {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is a before method annotation");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a before class annotation");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("This is a before test annotation");
	}
	@BeforeSuite
	public void beforesuit() {
		System.out.println("This is a before suite annotation");
	}
	@Test
	public void demo() {
		System.out.println("This is a demo method");
	}
	@Test
	public void demo1() {
		System.out.println("This is a demo1 method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is a after method annotation");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("This is a after test annotation");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("This is a after class annotation");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is a after suite annotation");
	}
}
