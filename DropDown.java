package module__7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
				 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
                 Select s= new Select(driver.findElement(By.id("continents")));
                 // select Africa by index by position
                 s.selectByIndex(2);
                 // select SouthAmerica by visible text
                 s.deselectByVisibleText("South America");
                 // select Antartica by Value
                 s.deselectByValue("g");
	}

}
