package Facebook_Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Launch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();                   
		System.out.println("My Title Is :" +title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url :" +currentUrl);
		
		String pagesource = driver.getPageSource();
		System.out.println("Pagesource :" +pagesource);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.instagram.com/?hl=en");
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.close();
	
		
		
	}

}
