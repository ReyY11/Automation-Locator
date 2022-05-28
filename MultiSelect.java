package module__7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args)throws InterruptedException  {
		// open the browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
					 WebDriver driver= new ChromeDriver();
					 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	             WebElement e=driver.findElement(By.id("selenium_commands"));
	             Select s= new Select(e);
					 // select by index
					 s.selectByVisibleText("Navigation Commands");
					 Thread.sleep(3000);
					 s.deselectByIndex(1);
					 List<WebElement> eList= s.getOptions();
					 int totalCount=eList.size();
					 for (int i=0;i<totalCount; i++)
					 {
						// print the text
						 String svalue= eList.get(i).getText();
						 System.out.println(svalue);
						 s.selectByIndex(i);
						 Thread.sleep(3000);
						 
					 }
				s.deselectAll();
				driver.close();
				
	}

}
