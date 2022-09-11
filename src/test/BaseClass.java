package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest // Executed only once before all the tests are executed
	(alwaysRun = true)
	public void method3() 
	{
		System.out.println("Inside the Before Test ");
	}
	
	@BeforeMethod  // called before every test
	(alwaysRun = true)
	public void method1() 
	{
		System.out.println("Inside the Before Method ");
	}
	
	@AfterMethod // called after every test
	(alwaysRun = true)
	public void method2() 
	{
		System.out.println("Inside the After Method ");
	}
	
	@AfterTest  // Executed only once after all the tests are executed
	(alwaysRun = true)
	public void method4() 
	{
		System.out.println("Inside the After Test ");
	}
	
}
