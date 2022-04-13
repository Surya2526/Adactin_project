package Browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_SM {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//singleDropdown
		
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select s = new Select(dropdown);
		
		//index,value,visible text
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		
		s.selectByValue("3");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Loadrunner");
		
		//MultipleDropdown
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select multipledropdown = new Select(multiple);
		
		boolean multiple2 = multipledropdown.isMultiple();
		System.out.println("Multiple DropDown :"+multiple2);
		
		System.out.println("--------------------Multipledropdown------------------");
		
		List<WebElement> options = multipledropdown.getOptions();
		
		int size = options.size();
		System.out.println("Size of DD :"+size);
		
		for(WebElement i :  options) {
			System.out.println(i.getText());
		}
		
		//get selected by index
		for (int i = 0; i < size; i++) {
			
			if(i==2 | i==3 | i==4 | i==7) {
				multipledropdown.selectByIndex(i);
			}
			
			
		}
		
		System.out.println("-------------All Selected Option-----------------");
		
		List<WebElement> all_selected = multipledropdown.getAllSelectedOptions();
		
		for(WebElement j : all_selected) {
			System.out.println(j.getText());
		}
		
		Thread.sleep(3000);
		
		System.out.println("--------------------First Select Option------------------");
		
		WebElement FirstSelectedOption = multipledropdown.getFirstSelectedOption();
		System.out.println(FirstSelectedOption.getText());
		
		driver.close();
	}

}
