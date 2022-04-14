package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
		
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();

		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		Thread.sleep(4000);
		System.out.println("Before Login methods");
	}
	
	@Parameters({"param1","param2"})
	@Test(groups= {"Sanity"}) 
	public void LoginTestcase1(String UserNameVal , String PasswordVal) {
		System.out.println("Inside  Login Test");
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

		WebElement email = driver.findElement(By.name("user_login"));
		email.sendKeys(UserNameVal);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(PasswordVal);

		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();

		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();

		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";

		Assert.assertEquals(ActMsg, ExpMsg);
		
		/*if (ActMsg.equals(ExpMsg)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
*/
		/*List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links " + Links.size());

		for (int i = 0; i < Links.size(); i++) {
			System.out.println("Href is " + Links.get(i).getAttribute("href"));
		}*/
	}

	@AfterMethod(alwaysRun = true)
	public void TearDown() {
		driver.close();
		System.out.println("After Login methods");
	}

}
