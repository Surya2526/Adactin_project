package com.task;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame_Task {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		WebElement name1 = driver.findElement(By.name("mytext1"));
		name1.sendKeys("Suresh");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		WebElement name2 = driver.findElement(By.name("mytext2"));
		name2.sendKeys("Ramesh");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		WebElement name3 = driver.findElement(By.name("mytext3"));
		name3.sendKeys("Bala Surya");
		driver.switchTo().frame(0);
		WebElement human = driver.findElement(By.xpath("//div[@id='i8']"));
		human.click();
		WebElement web_testing = driver.findElement(By.xpath("//div[@id='i25']"));
		web_testing.click();
		WebElement choose = driver.findElement(By.xpath("(//div[@role='listbox']/div/div/div)[1]"));
		choose.click();
		WebElement option = driver.findElement(By.xpath("//div[@role='listbox']/div[2]/div[3]"));
		option.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Frame.png");
		FileUtils.copyFile(src, des);
		WebElement next = driver.findElement(By.xpath("(//div[@role='button'])[2]"));
		next.click();
		WebElement short_text = driver.findElement(By.xpath("(//div[@role='listitem'])[2]/div/div/div[2]/div/div[1]/div/div/input"));
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(short_text));
		short_text.sendKeys("Today Quotes");
		WebElement long_text = driver.findElement(By.xpath("(//div[@role='listitem'])[3]/div/div/div[2]/div/div[1]/div[2]/textarea"));
		WebDriverWait w1 = new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.visibilityOf(long_text));
		long_text.sendKeys("Givers are happier than takkers");
		Thread.sleep(3000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Frame2.png");
		FileUtils.copyFile(src1, des1);
		WebElement submit = driver.findElement(By.xpath("(//div[@role='button'])[2]"));
		submit.click();
		Thread.sleep(3000);
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Frame3.png");
		FileUtils.copyFile(src2, des2);
		driver.close();
		
		
		
	
	
		
	
		
		
		
		
		
	}

}
