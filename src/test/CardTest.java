package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass{
	
	//here we can combine groups,enabling of the method
	@Test(groups= {"sanity"},enabled = true , description="This test will validate the cc functionality")
	public void CCTest() {
		System.out.println("Inside the CC Test ");
	}

}
