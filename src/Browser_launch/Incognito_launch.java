package Browser_launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Incognito_launch {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		Actions a = new Actions(driver);
		
		WebElement gmail = driver.findElement(By.className("gb_d"));
		a.contextClick(gmail).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
        TakesScreenshot screenshot = (TakesScreenshot) driver; //narrowing
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Screenshots\\Incognito.png");
		FileUtils.copyFile(source, destinationfile);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
