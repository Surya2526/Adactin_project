package com.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_New_Acc {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement new_acc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		new_acc.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Subash");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("C");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("subash666@gmail.com");
		WebElement email1 = driver.findElement(By.name("reg_email_confirmation__"));
		email1.sendKeys("subash666@gmail.com");
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("subash900");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(day);
		s.selectByValue("27");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByValue("9");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByValue("1997");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		signup.click();
		Thread.sleep(10000);
		//Screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver; //narrowing
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Fb_signup.png");
		FileUtils.copyFile(source, destinationfile);
		driver.close();
		
		
		
		
		
		
		
	}

}
