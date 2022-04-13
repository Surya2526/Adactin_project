package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement company = driver.findElement(By.xpath("//table/tbody/tr[4]/td"));
		System.out.println(company.getText());
		
		WebElement prev_close = driver.findElement(By.xpath("//div[@id='leftcontainer']//table/tbody/tr[4]/td[3]"));//absolute xpath
		System.out.println(prev_close.getText());
		
		
		
		
		
		
		
	}

}
