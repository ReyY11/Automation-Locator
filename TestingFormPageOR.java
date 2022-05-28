package module_9.objectRepo;



import org.openqa.selenium.By;

import module_9.utilities.BaseClass;


public class TestingFormPageOR extends BaseClass{
	
	public static By fName= By.xpath("//input[@name='ts_first_name']");
	
	public static By lName = By.xpath("//input[@id=\'ts_last_name\']");
	public static By add= By.xpath("//textarea[@id=\'ts_address\']");
	public static By nationality= By.xpath("//select[@id=\'ts_country\']");
	public static By male= By.xpath("//input[@value=\'male\']");
	public static By female = By.xpath("//input[@value=\'female\']");
	
	public static By cricket= By.xpath("//input[@name=\"ts_checkbox1\"]");
	public static By football = By.xpath("//input[@name=\"ts_checkbox2\"]");
	public static By hockey = By.xpath("//input[@name=\"ts_checkbox3\"]");
	
	public static By submit= By.xpath("//input[@name=\"Submit1\"]");
	
	public static void formFill(String fname, String lname, String address, int indexValue) {
		enterText(fName,fname);
		enterText(lName,lname);
		enterText(add,address);
		select(nationality,indexValue);
		click(male);
		click(football);
		click(submit);
		alertAction("ok");
		
	}
	
}
