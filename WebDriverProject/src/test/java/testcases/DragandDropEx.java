package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropEx {

	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       // System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
        
       WebDriver driver = new ChromeDriver();
        
     //   WebDriver driver = new FirefoxDriver();
        
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        
       WebElement From  = driver.findElement(By.xpath("//li[@id= 'credit2']/a"));
       
       WebElement To  = driver.findElement(By.xpath("//ol[@id= 'bank']/li"));
       
           Actions obj = new Actions(driver);
           obj.dragAndDrop(From, To).build().perform();
           
           //   driver.close();
        
	}
}

