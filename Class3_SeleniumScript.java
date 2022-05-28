package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3_SeleniumScript {

	public static void main(String[] args) {
		// open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(); 
	
	// kill browser
		// driver.close();
	// 	driver.quit();
	// Interact with browser
		driver.get("https://www.edureka.co/about-us");
		driver.getTitle();
		driver.getCurrentUrl();
		// Navigate the page
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		// Interact with element
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).getText();
		
		
		
	
	}
	
	
}
