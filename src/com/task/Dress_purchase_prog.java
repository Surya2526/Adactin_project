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

public class Dress_purchase_prog {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
		driver.manage().window().maximize();
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		women.click();
		Thread.sleep(3000);
		WebElement plus = driver.findElement(By.xpath("(//span[@class='grower CLOSE'])[2]"));
		plus.click();
		Thread.sleep(3000);
		WebElement casual = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]"));
		casual.click();
		Thread.sleep(3000);
		WebElement quickview = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product'])[4]"));
		quickview.click();
		Thread.sleep(3000);
		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		quantity.click();
		Thread.sleep(3000);
		WebElement size = driver.findElement(By.name("group_1"));
		Select s = new Select(size);
		s.selectByVisibleText("M");
		Thread.sleep(3000);
		WebElement Addtocart = driver.findElement(By.name("Submit"));
		Addtocart.click();
		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		checkout.click();
		Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		proceed.click();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("sbsurya1994@gmail.com");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("123456");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.name("SubmitLogin"));
		login.click();
		Thread.sleep(3000);
		WebElement address_proceed = driver.findElement(By.name("processAddress"));
		address_proceed.click();
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.name("cgv"));
		checkbox.click();
		Thread.sleep(3000);
		WebElement carrier = driver.findElement(By.name("processCarrier"));
		carrier.click();
		Thread.sleep(3000);
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		button.click();
		Thread.sleep(7000);
		//Screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver; //narrowing
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Shopping.png");
		
		FileUtils.copyFile(source, destinationfile);
		
		driver.close();
	}
	
}
