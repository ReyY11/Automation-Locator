package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // open the URL
        driver.get("https://github.com/");
        // implicitly wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // click on Sign in 
        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
        // enter user name
        driver.findElement(By.xpath("//input[@id='login_field' and @name='login']")).sendKeys("reyanshyadav8287@gmail.com");
        // enter password
        driver.findElement(By.xpath("//input[@name='password' and @id='password' ]")).sendKeys("Aarti@1211");
	    driver.findElement(By.xpath("//input[@data-signin-label='Sign in']")).click();
	    
       // click on logout button
	    driver.findElement(By.xpath("//summary[@aria-label='View profile and more']"));
        
	Thread.sleep(5000);
	// click on logout
	driver.findElement(By.xpath("//*[contains(text(),'Sign out']"));
	//Quit
	driver.quit();
	
	
	}
	

}
