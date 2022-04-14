package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotEx {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		TakesScreenshot obj = (TakesScreenshot) driver;

		File file = obj.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("img.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
