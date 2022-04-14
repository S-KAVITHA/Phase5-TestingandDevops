package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignuptest {
	
	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       // System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
        
       WebDriver driver = new ChromeDriver();
        
     //   WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        
        WebElement NewAccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
        NewAccount.click();
        
        WebElement DOB = driver.findElement(By.id("day"));
        Select ddDOB = new Select(DOB);
        ddDOB.selectByVisibleText("20");
        
        WebElement DOBmonth = driver.findElement(By.id("month"));
        Select ddDOBmonth = new Select(DOBmonth);
        ddDOBmonth.selectByVisibleText("Nov");
        
        List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
      
        for (int i=0; i < Months.size(); i ++) {
        	System.out.println(Months.get(i).getText());
        }
        
        ////select[@id='month']/option[@selected='1']
    //select[@id='month']/option[@selected='1'] 
        
        //select[@id='month']/parent::* 
        //select[@id='month']/preceding-sibling::*
    ////select[@id='month']/following-sibling::*
        
       // radio
        //input[@type="radio
        
        WebElement DOBmonthsel = driver.findElement(By.xpath("//select[@id='month']/option[@selected='1'] "));
      DOBmonthsel.click();
      
      /* 
      
        WebElement Gender = driver.findElement(By.xpath ("//input[@type='radio' and @value='1']"));
        Gender.click();
        */
        
        String GenderVal = "Male";
        String GenXpath = "//label[text()='" + GenderVal +"']/following-sibling::*";
     		    
        WebElement Gender1 = driver.findElement(By.xpath (GenXpath));
        Gender1.click();
        
        
      
	}
}
