package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		// open browser
		//open the url
		//locator techniques
		//ID
		//Name
		// ClassName
		// link text
		//partiall link text
		// tag name
		// xpath
		
		// open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		//open the url
		driver.get("https://www.linkedin.com/login");
		
		//locator techniques
				//ID
		driver.findElement(By.id("username")).sendKeys("Rahul");
		Thread.sleep(3000);
		
		driver.findElement(By.name("session_key")).clear();
		
		driver.findElement(By.id("password")).sendKeys("YADAV");
		driver.findElement(By.className("button__password-visibility")).click();
		
		// driver.quit();
		// link text
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// partial linktext
		driver.findElement(By.partialLinkText("got p")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//driver.quit();
		// CSS- cascading style sheet
		driver.findElement(By.cssSelector("input#session_password")).sendKeys("RAJAT");
		// Xpath
		//Absolute xpath
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div[1]/h1")).clear();
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div[1]/h1")).sendKeys("Edureka Guest");
		// Relative xpath
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/div[1]/h1")).clear();
		
		driver.findElement(By.xpath("//input[@id=\"id_form\" AND name=\"name\"]")).clear();
		
		
		
		
		
		
		
		
	}

}
