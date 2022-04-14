package testng;

import org.testng.annotations.Test;

public class CardTest {

	@Test(groups= {"Sanity"} ,  priority = 0 , description = " This test is for Card loan") 
	public void CreditCardLoanTest() {
		
		System.out.println("Inside  CreditCard Testing");
	}
	
	}
