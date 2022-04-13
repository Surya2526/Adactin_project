package Browser_launch;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : all_data) {
			System.out.println(all.getText());	
		}
		System.out.println("***********Header***************");
		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement h : header) {
			System.out.println(h.getText());
		}
		System.out.println("***********Specific row**************");
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement r : row) {
			System.out.println(r.getText());
		}
		System.out.println("*************specific column**************");
		
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement col : column) {
			System.out.println(col.getText());
		}
		System.out.println("**********Row Size************");
		List<WebElement> row_size = driver.findElements(By.tagName("tr"));
		int size = row_size.size();
		System.out.println("Row Size :" +size);
		System.out.println("***********Column Size************");
		List<WebElement> col_size = driver.findElements(By.tagName("th"));
		int size2 = col_size.size();
		System.out.println("Column Size :" +size2);
		System.out.println("************following************");
		WebElement follow = driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[5]"));
	    System.out.println(follow.getText());
	    driver.close();

	    
	}
}
