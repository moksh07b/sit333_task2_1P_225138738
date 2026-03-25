package sit707_week2;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
				
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Moksh");
		
		element = driver.findElement(By.id("lastname"));
		
		element.sendKeys("Bansal");
		
		element = driver.findElement(By.id("phoneNumber"));
		element.sendKeys("0403345678");
		
		element = driver.findElement(By.id("email"));
		element.sendKeys("abcgmail34@gmail.com");
		
		element = driver.findElement(By.id("password"));
		element.sendKeys("123456798");
		
		element = driver.findElement(By.id("confirmPassword"));
		element.sendKeys("123456798");
		
		element = driver.findElement(By.className("iJIqgV"));
		element.click();
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("officeworks.png");
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("Screenshot saved");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(dest.getAbsolutePath());
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
		public static void automation_registration_page(String url) {
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
				
		// Find first input field which is firstname
		
		WebElement element = driver.findElement(By.name("name"));
		element.sendKeys("Moksh Bansal");
		
		
		element = driver.findElement(By.cssSelector("[data-qa='signup-email']"));
		element.sendKeys("abcgmail34@gmail.com");
		
	
		
		element = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
		element.click();
	
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("automation.png");
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("Screenshot saved");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(dest.getAbsolutePath());
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
