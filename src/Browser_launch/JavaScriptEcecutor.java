package Browser_launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEcecutor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  //JavascriptExecutor
		
		js.executeScript("window.scroll(0,5000)", "");  //Scroll down
		
		Thread.sleep(6000);
		
		//js.executeScript("window.scroll(0,-5000)", ""); //Scroll up
		
		WebElement amazon_device = driver.findElement(By.xpath("//a[text()='Amazon Devices']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", amazon_device);
		
		js.executeScript("arguments[0].click()", amazon_device);
		
		
		
		
		
		
		
		
		
		
	}
	

	
}
