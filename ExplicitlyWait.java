package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		//open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open the URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2021/05/blog-post.html");
		// Explicitly wait
		// driver.findElement(By.id("mybutton"));
		WebDriverWait wait=new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mybutton"))).click();
		

	}

}
