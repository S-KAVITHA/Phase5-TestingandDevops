package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
        
      //  WebDriver driver = new ChromeDriver();
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        
        Thread.sleep(4000);
        
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        LoginLink.click();
        
        WebElement email = driver.findElement(By.name("user_login"));
        email.sendKeys("abc@xyz.com");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prqwec@123");
       
        WebElement RememberMe = driver.findElement(By.className("rememberMe"));
        RememberMe.click();
        
        WebElement LoginBtn = driver.findElement(By.name("btn_login"));
        LoginBtn.click();
        
        WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
        String ActMsg = ErrorMsg.getText();
        String ExpMsg = "The email or password you have entered is invalid.";
        
        if (ActMsg.equals(ExpMsg)){
        	System.out.println("Test Passed");
        }else {
        	System.out.println("Test Failed");
        }
        
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links "+ Links.size());
        
        for (int i=0 ; i < Links.size() ; i++) {
        	System.out.println("Href is " + Links.get(i).getAttribute("href"));
        }
        driver.close();
        
        
    }
	
}
