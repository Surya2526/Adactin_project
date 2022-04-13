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

public class Adactin_launch {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement name1 = driver.findElement(By.name("username"));
		name1.sendKeys("surya1994");
		Thread.sleep(3000);
		WebElement Pass1 = driver.findElement(By.name("password"));
		Pass1.sendKeys("surya@11");
		Thread.sleep(3000);
		WebElement login1 = driver.findElement(By.name("login"));
		login1.click();
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByValue("Paris");
		Thread.sleep(3000);
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		Thread.sleep(3000);
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Super Deluxe");
		Thread.sleep(3000);
		WebElement room_nos = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(room_nos);
		s3.selectByValue("1");
		Thread.sleep(3000);
		WebElement members = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(members);
		s4.selectByValue("2");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		WebElement radio_button = driver.findElement(By.id("radiobutton_0"));
		radio_button.click();
		Thread.sleep(3000);
		WebElement go = driver.findElement(By.name("continue"));
		go.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("Bala");
		Thread.sleep(3000);
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("Surya");
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("18A,Greenfield_Road,Chennai");
		Thread.sleep(3000);
		WebElement card_num = driver.findElement(By.name("cc_num"));
		card_num.sendKeys("6785432167894532");
		Thread.sleep(3000);
		WebElement card_type = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(card_type);
		s6.selectByIndex(3);
		Thread.sleep(3000);
		WebElement expire = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(expire);
		s7.selectByValue("12");;
		Thread.sleep(3000);
		WebElement expire_year = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(expire_year);
		s8.selectByValue("2022");
		Thread.sleep(3000);
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("567");
		Thread.sleep(3000);
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		logout.click();
		Thread.sleep(5000);
		//Screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver; //narrowing
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Adactin.png");
		
		FileUtils.copyFile(source, destinationfile);
		
		driver.close();
		
		
		
		
		
	}

}
