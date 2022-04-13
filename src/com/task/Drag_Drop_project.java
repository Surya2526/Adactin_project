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
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_project {
	
	public static void draganddrop(WebElement capital, WebElement country, WebDriver driver) {
		
		Actions a = new Actions(driver);
		a.dragAndDrop(capital, country).build().perform();
		//a.clickAndHold(capital).moveToElement(country).build().perform();
	
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement capital = driver.findElement(By.id("box6"));
		WebElement country = driver.findElement(By.id("box106"));
		
		WebElement capital1 = driver.findElement(By.id("box7"));
		WebElement country1 = driver.findElement(By.id("box107"));
		
		draganddrop(capital, country, driver);
		draganddrop(capital1, country1, driver);
		
		Thread.sleep(3000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver; //narrowing
		File source1 = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Drag&Drop_project.png");
		FileUtils.copyFile(source1, destinationfile);
		
		driver.close();
		
		
		
		
		
	}
	
	
	

}
