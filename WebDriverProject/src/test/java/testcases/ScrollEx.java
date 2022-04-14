package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEx {
	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       // System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
        
       WebDriver driver = new ChromeDriver();
        
     //   WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        
       WebElement ScrollTo = driver.findElement(By.xpath("//h2[text()='Table Rows']"));
       JavascriptExecutor jsobj = (JavascriptExecutor) driver;
       jsobj.executeAsyncScript("arguments[0].scrollIntoView()", ScrollTo);        
     //   driver.close();
        
	}
}
