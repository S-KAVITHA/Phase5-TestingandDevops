package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginTest {
	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     //   System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
      //  WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        
        WebElement  UserName = driver.findElement(By.xpath("//input[@id='email']"));
        
        //WebElement UserName = driver.findElement(By.cssSelector("input#email"));
        
        //WebElement UserName = driver.findElement(By.cssSelector("input.email"));
        //WebElement UserName = driver.findElement(By.cssSelector("input[name = 'user_login']));
        
        WebElement  Password = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement  LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
        WebElement  Fbtext = driver.findElement(By.xpath("*[text()='Connect with friends and the world around you on Facebook.']"));
      //h2[contains(text(),'world around you on Facebook')]
      //h2[starts-with(text(),'Facebook helps')]
          //form/div/div/input/      
        ////*[text()='Forgotten password?']
       //Fbtext.
       
        UserName.sendKeys("abcdz");
        Password.sendKeys("pewcc");
        LoginBtn.click();
        
        
        //h2[text()='Connect with friends and the world around you on Facebook.']
        //driver.close();
 
	}        

}
