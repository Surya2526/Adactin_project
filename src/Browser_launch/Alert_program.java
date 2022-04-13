package Browser_launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_program {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Simple Alert
		
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		//Confirm Alert
		
		WebElement confirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		button.click();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.dismiss();
		
		WebElement text = driver.findElement(By.id("demo"));
		System.out.println(text.getText());
		
		//Prompt Alert
		
		WebElement prompt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt.click();
		WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button2.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Hi, This is surya");
		Thread.sleep(3000);
		alert3.accept();
		
		WebElement text2 = driver.findElement(By.id("demo1"));
		System.out.println(text2.getText());
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}

}
