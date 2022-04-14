package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		WebElement button1 = driver.findElement(By.xpath("//button[@id= 'alertButton']"));

		button1.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		
		WebElement button2 = driver.findElement(By.xpath("//button[@id= 'confirmButton']"));
		Thread.sleep(100);
		button2.click();
		
		alert = driver.switchTo().alert();
		Thread.sleep(100);
		alert.dismiss();

		
		WebElement button3 = driver.findElement(By.xpath("//button[@id= 'promtButton']"));
		Thread.sleep(1000);
		button3.click();
		
		alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.sendKeys("Message");
		Thread.sleep(1000);
		alert.accept();
		
		
		// driver.close();

	}

}
