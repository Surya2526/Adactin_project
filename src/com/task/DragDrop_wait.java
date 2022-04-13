package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop_wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/arrange-table-rows/demo.html");
		Actions a = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[1]"));
		WebDriverWait w = new WebDriverWait(driver, 40);
		w.until(ExpectedConditions.visibilityOf(drag));
		
		WebElement drop = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[5]"));
		WebDriverWait w1 = new WebDriverWait(driver, 40);
		w1.until(ExpectedConditions.visibilityOf(drop));
		
		WebElement drag1 = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[4]"));
		WebDriverWait w2 = new WebDriverWait(driver, 40);
		w2.until(ExpectedConditions.visibilityOf(drag1));
		
		WebElement drop1 = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[9]"));
		WebDriverWait w3 = new WebDriverWait(driver, 40);
		w3.until(ExpectedConditions.visibilityOf(drop1));
		
		a.dragAndDrop(drag, drop).build().perform();
		a.dragAndDrop(drag1, drop1).build().perform();
		
		
		
		
	}

}
