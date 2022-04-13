package Browser_launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		Actions a = new Actions(driver);
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		a.contextClick(mobile).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement tdy_deal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		a.contextClick(tdy_deal).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement help = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		a.contextClick(help).build().perform();
		
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
		
	/*	String child ="Amazon.in - Today's Deals";
		
		for (String childwindow : allwindow) {
			
			if(driver.switchTo().window(childwindow).getTitle().equalsIgnoreCase(child)) {
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


