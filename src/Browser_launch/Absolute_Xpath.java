package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.adidas.co.in/men");
		
		WebElement shoe = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div/div/div[2]/div[6]/section/div/div/div[2]"
				+ "/div[2]/div/div[1]/div[1]/section/div/div/div/div"));
		shoe.click();
		
		
		
		
	}

}
