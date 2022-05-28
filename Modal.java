package module__7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
	       driver.findElement(By.xpath("//input[@class=\'_2IX_2- VJZDxU\']")).sendKeys("Rahul");
	}

}
