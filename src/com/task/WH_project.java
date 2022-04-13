package com.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WH_project {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
        Actions a = new Actions(driver);
		
		WebElement men = driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
		a.contextClick(men).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement women = driver.findElement(By.xpath("(//a[@href='/shop/women'])[1]"));
		a.contextClick(women).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement kids = driver.findElement(By.xpath("(//a[@href='/shop/kids'])[1]"));
		a.contextClick(kids).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//ParentID
		
		String parentid = driver.getWindowHandle();
		System.out.println("Parent ID :" +parentid);
				
		//size
				
		int size = driver.getWindowHandles().size();
		System.out.println("Size :" +size);
		
		//Get all window title
		
		Set<String> allwindow = driver.getWindowHandles();
				
			for (String i : allwindow) {
					
				String title = driver.switchTo().window(i).getTitle();
					
				System.out.println("Title :" +title);
				Thread.sleep(3000);
			}
		
			//Specific child window
			
/*			String women1 = "Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More";
			for (String women_window : allwindow) {
				if (driver.switchTo().window(women_window).getTitle().equalsIgnoreCase(women1)) {
					break;
					
				}
			*/
			//except parent close all window
			
			for (String closewindow : allwindow) {
				
				if (!closewindow.equals(parentid)) {
					driver.switchTo().window(closewindow).close();
					
				}
				
		
				
			}
				
			}
		
		
			
	}


