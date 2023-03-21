package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	@BeforeClass
	private void beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	private void Afterclass() {
		
		System.out.println("After Class");
	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	private void Aftermethod() {
		System.out.println("After Method");
	}
	
	@Test (priority=1)
	private void test1() {
		System.out.println("Test 1");
	}
	
	@Test (priority=0)
	private void test2() {
		System.out.println("Test 2");
	}

	@Test (priority=2, enabled = false)
	private void test3()
	{
		System.out.println("Test 3");
	}
	
	@Test (priority=3)
	private void test4()
	{
		System.out.println("Test 4");
	}


}

