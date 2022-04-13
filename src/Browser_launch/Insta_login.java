package Browser_launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_login {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.xpath("//input [@ type ='text']"));
		id.sendKeys("Rahul");
		
		WebElement Pass = driver.findElement(By.xpath("//input [contains(@aria-label,'Password')]"));
		Pass.sendKeys("12345678");
		
		WebElement signin = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		signin.click();
		
		Thread.sleep(5000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver; //narrowing
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Instagram.png");
		
		FileUtils.copyFile(source, destinationfile);
		
		
	}

}
