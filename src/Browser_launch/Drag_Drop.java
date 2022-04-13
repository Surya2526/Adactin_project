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
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		
	    WebElement destination = driver.findElement(By.id("droppable"));
	    //a.clickAndHold(from).moveToElement(to).build().perform();
	    
	    //a.clickAndHold(source).moveToElement(destination).build().perform();
	    
	    a.dragAndDrop(source, destination).build().perform();
	    
	    Thread.sleep(3000);
	    
	    //Screenshots
        TakesScreenshot screenshot = (TakesScreenshot) driver; //narrowing
		File source1 = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Drag&Drop.png");
		FileUtils.copyFile(source1, destinationfile);
	    
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
		
	}

}
