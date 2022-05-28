package module__7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// open the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
				 WebDriver driver= new ChromeDriver();
				 // open the URL
				 driver.get("https://www.myntra.com/");
				 // search for jackets
				 driver.findElement(By.xpath("//input[@class=\'desktop-searchBar\']")).sendKeys("Jackets");
				 driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]//following::a[1]")).click();
				 // using mouse hover 
				 WebElement e = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]//following:: img[1]"));
				Actions act= new Actions(driver); 
				// perform the action
				act.moveToElement(e).build().perform();
				//kill the browser
				//driver.close();
				
	}

}
