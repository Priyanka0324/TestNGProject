package test;


import org.testng.annotations.Test;
@Test(groups= {"regression"})
public class LoanTest extends BaseClass{
	
	

	// @Test is annotation is given to make the HomeLoanTest method as a test  case w/o using Main method - 1 pros of TestNG
	
	@Test(priority=1)
	public void HomeLoanTest()
	{
		System.out.println("Inside HomeLoanTest");

	}
	
	@Test(enabled=true)  // without priority this will be executed 1st
	public void PersonalLoanTest() {
		
		System.out.println("Inside PersonalLoanTest");
	}

	@Test(priority=0)
	public void PersonalLoanTest1() {
		
		System.out.println("Inside PersonalLoanTest1");
	}

}
