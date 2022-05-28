package module_8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
	// open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 // open the URL
		 driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		 Dimension d= new Dimension(600,650);
		 driver.manage().window().setSize(d);
		 // to capture the main window & print the same
		 String mw= driver.getWindowHandle();
		 System.out.println("Main Window name is- "+ mw);
		 System.out.println("==================================================================");
        // generate a new window
		 driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		 Set<String> awn=driver.getWindowHandles();
		 
		
		 // Get All window name
		 System.out.println("All Window name-"+ awn);
		 System.out.println("==================================================================");
		 // Now using the array concept to get the unique name for window1 & window2
		 String Window1= (String) awn.toArray()[0];
		 System.out.println("Window1 Name is:" + Window1 );
		 System.out.println("=============================================================");
		 String Window2= (String) awn.toArray()[1];
		 System.out.println("Window2 Name is:" + Window2 );
		 System.out.println("=============================================================");
		 driver.switchTo().window(Window2);
		 driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Rahul Yadav");
		 driver.findElement(By.xpath("//input[@name=\"q\"]")).submit();
		 Thread.sleep(3000);
		 driver.switchTo().window(Window1);
		 Thread.sleep(3000);
		 driver.switchTo().window(Window2);
		 driver.close();
		 Thread.sleep(2000);
		 driver.quit();
	}
	
	
	

}
