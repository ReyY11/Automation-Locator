package module_9.objectRepo;

import org.openqa.selenium.By;

import module_9.utilities.BaseClass;

public class HomePageOR extends BaseClass {
public static By testingFormPage= By.xpath("//a[contains(text(),'Testing Form Page')]");
public static  By shortWait= By.xpath("//a[contains(text(),'Short Wait')]");
public static  By longWait= By.xpath("//a[contains(text(),'Long Wait')]");
public static By xPathOperator=By.xpath("//a[contains(text(),'Xpath Operators')]");
public static By keyBoardOperation= By.xpath("//a[contains(text(),'Keyboard Disabled')]");

public static void clickTestingFormPage() {
	click(testingFormPage);
}
public static void clickShortWait() {
	click(shortWait);
}
public static void clickLongWait() {
	click(longWait);
}
	public static void clickXPathOperator() {
		click(xPathOperator);
	}
	public static void clickKeyBoardOperation() {
		click(keyBoardOperation);
	}
}

