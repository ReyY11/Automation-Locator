package module_9.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println(browserName +  "Browser is up & running");
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver.exe");
			driver= new FirefoxDriver();
			System.out.println(browserName +  "Browser is up & running");
		}
		else {
			System.out.println("Unable to Launch" +  browserName + "broswer");
		}
	}
     public static void openAUT() {
    	 try {
    		 driver.get("https://seleniumautomationpractice.blogspot.com/");
    		 System.out.println("AUT is up & running");
    	 }
    	 catch(Exception e){
    		 System.out.println("Unable to open URL"+ e.getMessage());
    	 }
     }
	
     public static void enterText(By loc, String data) {
    	 try {
    		 driver.findElement(loc).clear();
    		 driver.findElement(loc).sendKeys(data);
    		 
    		 System.out.println("Enter the-"+ data+ "- into the text box");
    	 }
    	 catch(Exception e){
    		 System.out.println("Unable to enter the value  on the element having locator");
    	 }
     }
     
     public static void select(By loc, String data ) {
    	 try {
    		 new Select(driver.findElement(loc)).selectByVisibleText(data);
    		 System.out.println("Select the" + data+ " using-" +loc);
    	 } catch(Exception e) {
    		 System.out.println("Unable to select the "+ data+ " using-" +loc); 
    		 }
     }
     public static void select(By loc, int no ) {
    	 try {
    		 new Select(driver.findElement(loc)).selectByIndex(no);
    		 System.out.println("Select the" + no+ " using-" +loc);
    	 } catch(Exception e) {
    		 System.out.println("Unable to select the "+ no+ " using-" +loc); 
    		 }
     }
     
     public static void click (By loc) {
    	 try {
    		 driver.findElement(loc).click();
    		 System.out.println("Clicked on the element having locator:-"+ loc);
    	 }
    	 catch(Exception e){
    		 System.out.println("Unable to Click on the element having locator:-" + loc);
    	 }
     }

     public static void alertAction(String Action) {
    	 try {
    		 if(Action.equalsIgnoreCase("ok")) {
    			System.out.println(driver.switchTo().alert().getText());
    		 }
    		 else if(Action.equalsIgnoreCase("cancel")) {
    			 driver.switchTo().alert().dismiss();
    		 }
    		 }
    	 catch(Exception e) {
    		 System.out.println("Error in performing in action"+Action);
    		 
    	 }
     }
     
     public static void textValidation(By loc, String expectedValue) {
    	 String actualText= driver.findElement(loc).getText();
    	 boolean result= actualText.equals(expectedValue);
    	 System.out.println("Result of Actual Text"+actualText+" Vs Expected Value"+expectedValue);
    	 
     }
     
     
     
     
}
