package Facebook_Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {
	 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.id("reg_pages_msg"));
		String fb = text.getText();
		System.out.println(fb);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("abcd@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456");
		
		WebElement button = driver.findElement(By.name("login"));
		button.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
