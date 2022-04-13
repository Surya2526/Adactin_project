package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));  //symbol #
		email.sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		email.clear();
		
		WebElement password = driver.findElement(By.cssSelector("input[id='pass']")); //or [id='pass'] //using attribute
		password.sendKeys("123456");
		Thread.sleep(2000);
		password.clear();
		
		WebElement email1 = driver.findElement(By.cssSelector("input.inputtext")); //symbol .
		email1.sendKeys("bcdm@gmail.com");
		Thread.sleep(2000);
		email1.clear();
		
		WebElement password1 = driver.findElement(By.cssSelector("input[id='pass'][name='pass']")); //Multiple attribute
		password1.sendKeys("678854");
		Thread.sleep(2000);
		password1.clear();
		
		WebElement email2 = driver.findElement(By.cssSelector("[id^='em']")); //prefix
		email2.sendKeys("shdg@gmail.com");
		Thread.sleep(2000);
		email2.clear();
		
		WebElement password2 = driver.findElement(By.cssSelector("[name$='ss']")); //suffix
		password2.sendKeys("234567");
		Thread.sleep(2000);
		password2.clear();
		
		WebElement email3 = driver.findElement(By.cssSelector("[class*='inputtext _55r1']")); //contains
		email3.sendKeys("ghjk@gmail.com");
		Thread.sleep(2000);
		email3.clear();
		
		driver.close();
		
		
		
		
		
	}

}
