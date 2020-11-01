package testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login {
	
	@Test
	public void login() {
		
		String browser = System.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("chrome")) {
			System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");		
		
		}
	}

}
