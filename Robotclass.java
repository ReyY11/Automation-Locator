package module__7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// open the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
				 WebDriver driver= new ChromeDriver();
				 // open the URL
				 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
				 WebElement e = driver.findElement(By.id("photo"));
					Actions act= new Actions(driver); 
				
					// perform the action
					act.moveToElement(e).click().perform();
					// define the file path
					String filePath="Pictures\\download.png";
					// store the location of the file path in clip board
					StringSelection sel= new StringSelection(filePath);
					// copy the path to clip board
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
					// create an object for robot class
					Robot robot = new Robot();
					// press enter
					robot.keyPress(KeyEvent.VK_ENTER);
					// release the key
					robot.keyRelease(KeyEvent.VK_ENTER);
					//press CTRL+V
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					// release CTRL+V
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					Thread.sleep(3000);
					// press enter
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
					// kill the browser
					driver.close();
					
	}

}
