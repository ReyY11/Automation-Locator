package module__7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
         driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
         driver.switchTo().frame("ID_Frame1");
         driver.findElement(By.id("ts_address")).sendKeys("Lucknow,U.P");
         driver.switchTo().parentFrame();
         Thread.sleep(1000);
         driver.switchTo().frame("ID_Frame2");
         driver.findElement(By.name("firstname")).sendKeys("Rahul");
         Thread.sleep(1000);
         
         driver.close();
         
	}

}
