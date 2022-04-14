package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanTest {
	
	@BeforeTest(alwaysRun = true)
	public void method3() {
		System.out.println("Before All methods");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void method1() {
		System.out.println("Before methods");
	}
	

	@Test(groups= {"Sanity"}, priority = 2 , description = " This test is for Home loan")
	public void HomeLoanTest() {
		System.out.println("Inside HomeLoan Test");
	}
	
	@Test(enabled = true ,  priority = 1 , description = " This test is for Car loan")
	public void CarLoanTest() {
		System.out.println("Inside CarLoan Test");
	}

	@AfterMethod(alwaysRun = true)
	public void method2() {
		System.out.println("After methods");
	}
	
	@AfterTest(alwaysRun = true)
	public void method4() {
		System.out.println("After all methods");
	}
	
}
